package com.scala99

/**
  * (**) Rotate a list N places to the left.
Examples:
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  */
object P19 {

  def rotate[A](n: Int, as: List[A]): List[A] = {
    def go(n: Int, as: List[A]): List[A] = {
      if(n == 0) as
      else go(n - 1, as.tail ++ List(as.head))
    }

    val shiftCount = if(n >= 0) n else as.length + n

    go(shiftCount, as)
  }
}
