package typequuxnative.libex

import typequux._
import typequux._

object RecordEx {

  def run: Unit = {
    println("Running RecordEx...")
    val r1 = RNil.add("a", List(1, 2, 3)).add("p", 42L).add("v", "unicorn")
    val r2 = r1.add("x", Some("one wants you"))
    val r3 = r1.updated("a", Some(List(1, 2, 3)))

    val r1AsMap = r1.toMap
    val r2AsMap = r2.toMap
    val r3AsMap  = r3.toMap

    println("""Built r1 as: RNil.add("a", List(1, 2, 3)).add("p", 42L).add("v", "unicorn")""")
    println("""Built r2 as: r1.add("x", Some("one wants you"))""")
    println("""Build r3 as: r1.updated("a", Some(List(1, 2, 3)))""")

    println("""r1("a"): """ + r1("a"))
    println("""r1("p"): """ + r1("p"))
    println("""r1("v"): """ + r1("v"))
    println("""r2("a"): """ + r2("a"))
    println("""r2("p"): """ + r2("p"))
    println("""r2("b"): """ + r2("v"))
    println("""r2("x"): """ + r2("x"))
    println("""r3("a"): """ + r3("a"))
    println("""r3("p"): """ + r3("p"))
    println("""r3("v"): """ + r3("v"))
    println("r1.size: " + r1.size)
    println("r2.size: " + r2.size)
    println("r3.size: " + r3.size)
    println("r1.toMap: " + r1.toMap)
    println("r2.toMap: " + r2.toMap)
    println("r3.toMap: " + r3.toMap)

    case class Demo(a: String, b: Long)
    println("Declared class demo as Demo(a: String, b: Long)")
    val r4 = Record.class2Record(Demo("me", 22l))
    println("""Built r4 as: Record.class2Record(Demo("me", 22l))""")
    println("""r4("a"): """ + r4("a"))
    println("""r4("b"): """ + r4("b"))
  }

}
