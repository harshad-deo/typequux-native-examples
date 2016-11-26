package typequuxnative

import libex._

object TypequuxNative {

  val delim = "\n" + ("*" * 100)

  def main(args: Array[String]): Unit = {
    println(delim)
    RecordEx.run
    println(delim)
    HListEx.run
  }
}