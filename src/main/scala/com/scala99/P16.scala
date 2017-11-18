package com.scala99

/**
  * (**) Drop every Nth element from a list.
Example:
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */
object P16 {

  def drop[A](n: Int, as: List[A]): List[A] = {
    as.zipWithIndex.foldLeft(List.empty[A]) {
      case (rs, (a, index)) => if ((index + 1) % n == 0) rs else a :: rs
    }.reverse
  }

}
