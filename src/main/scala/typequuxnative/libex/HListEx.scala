package typequuxnative.libex

import typequux._
import typequux._

object HListEx {

  def run: Unit = {
    println("Running HListEx...")

    val x = "str" :+: true :+: 1 :+: Some(3.14) :+: HNil
    println("""Built x as: "str" :+: true :+: 1 :+: Some(3.14) :+: HNil""")

    val xh: String = x.head
    val xth: Boolean = x.tail.head
    val xttth: Option[Double] = x.tail.tail.tail.head

    println("x.head: " + xh)
    println("x.tail.head: " + xth)
    println("x.tail.tail.tail.head: " + xttth)

    val p = 3 :+: "ai4" :+: List('r', 'h') :+: HNil
    val q = '3' :+: 2 :+: 'j' :+: "sdfh" :+: HNil
    val pq: Int :+: String :+: List[Char] :+: Char :+: Int :+: Char :+: String :+: HNil = p :++: q

    println("""Built p as: 3 :+: "ai4" :+: List('r', 'h') :+: HNil""")
    println("""Built q as: '3' :+: 2 :+: 'j' :+: "sdfh" :+: HNil""")
    println("""p :++: q: """ + pq)

    println("x.length: " + x.length)
    println("p.length: " + p.length)
    println("q.length: " + q.length)
    println("pq.length: " + pq.length)

    val xr: Some[Double] :+: Int :+: Boolean :+: String :+: HNil = x.reverse
    val pr: List[Char] :+: String :+: Int :+: HNil = p.reverse
    val qr: String :+: Char :+: Int :+: Char :+: HNil = q.reverse

    println("x.reverse: " + x.reverse)
    println("p.reverse: " + p.reverse)
    println("q.reverse: " + q.reverse)

    println("x.reverse.reverse == x: " + (x.reverse.reverse == x))
    println("p.reverse.reverse == p: " + (p.reverse.reverse == p))
    println("q.reverse.reverse == q: " + (q.reverse.reverse == q))

    val y1 = 9.75 :+: 'x' :+: HNil
    val y2 = -2.125 :+: 'X' :+: HNil
    val f = ((x: Double) => x.floor.toInt) :+: ((x: Char) => x.isUpper) :+: HNil

    val r1: Int :+: Boolean :+: HNil = y1 yapply f
    val r2: Int :+: Boolean :+: HNil = y2 yapply f
    val r3: Int :+: Boolean :+: HNil = f fapply y1
    val r4: Int :+: Boolean :+: HNil = f fapply y2

    println("Built y1 as: 9.75 :+: 'x' :+: HNil")
    println("Built y2 as: -2.125 :+: 'X' :+: HNil")
    println("Built f as: ((x: Double) => x.floor.toInt) :+: ((x: Char) => x.isUpper) :+: HNil")
    println("y1 yapply f: " + r1)
    println("y2 yapply f: " + r2)
    println("f yapply y1: " + r3)
    println("f yapply y2: " + r4)
    println("(y1 yapply f) == (f yapply y1): " + (r1 == r3))
    println("(y2 yapply f) == (f yapply y2): " + (r2 == r4))

    val w = 3 :+: true :+: "asdf" :+: 'k' :+: () :+: 9.3 :+: HNil
    val idxd = w.t[String]

    println("""Built w as: 3 :+: true :+: "asdf" :+: 'k' :+: () :+: 9.3 :+: HNil""")
    println("Built idxd as: w.t[String]")

    val before: Int :+: Boolean :+: HNil = idxd.before
    println("idxd.before: " + before)

    val at: String = idxd.at
    println("idxd.at: " + at)

    val after: Char :+: Unit :+: Double :+: HNil = idxd.after
    println("idxd.after: " + after)

    val drp: String :+: Char :+: Unit :+: Double :+: HNil = idxd.drop
    println("idxd.drop: " + drp)

    val tk: Int :+: Boolean :+: HNil = idxd.take
    println("idxd.take: " + tk)

    val upd: Int :+: Boolean :+: Int :+: Char :+: Unit :+: Double :+: HNil = idxd.updated(19)
    println("idxd.updated(19): " + upd)

    val rm: Int :+: Boolean :+: String :+: Char :+: Double :+: HNil = w.t[Unit].remove
    println("w.t[Unit].remove: " + rm)

    val mp: Int :+: Boolean :+: String :+: Boolean :+: Unit :+: Double :+: HNil = w.t[Char].map(_.isUpper)
    println("w.t[Char].map(_.isUpper): " + mp)

    val fmp: Int :+: Boolean :+: Char :+: String :+: Char :+: Unit :+: Double :+: HNil =
      w.t[String].flatMap(s => s(0) :+: s.substring(1) :+: HNil)
    println("w.t[String].flatMap(s => s(0) :+: s.substring(1) :+: HNil): " + fmp)

    val ins: Int :+: Boolean :+: Option[Double] :+: String :+: Char :+: Unit :+: Double :+: HNil =
      w.t[String].insert(Some(4.4))
    println("w.t[String].insert(Some(4.4)): " + ins)

    val insH: Int :+: Boolean :+: Option[Boolean] :+: Option[String] :+: String :+: Char :+: Unit :+: Double :+: HNil =
      w.t[String].insertM(Some(true) :+: None :+: HNil)
    println("w.t[String].insertM(Some(true) :+: None :+: HNil): " + insH)

    val (l, r): (Int :+: Boolean :+: String :+: HNil, Char :+: Unit :+: Double :+: HNil) = w.t[Char].splitAt
    println("w.t[Char].splitAt: " + (l, r))

  }

}
