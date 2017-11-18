package com.scala99

/**
  * (**) Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but
not including the Kth element of the original list. Start counting the elements with 0.
Example:

scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */
object P18 {

  def slice[A](start: Int, end: Int, as: List[A]): List[A] = {
    def go(start: Int, end: Int, as: List[A], result: List[A]): List[A] = {
      (start, end, as) match {
        case (0, 0, _) => result
        case (0, end, h :: t) => go(0, end - 1, t, h :: result)
        case (start, end, h :: t) => go(start - 1, end - 1, t, result)
        case _ => result
      }
    }

    go(start, end, as, List.empty[A]).reverse
  }

}
