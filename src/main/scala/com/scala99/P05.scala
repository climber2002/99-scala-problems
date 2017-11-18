package com.scala99

/**
  * Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object P05 {

  def reverse[A](as: List[A]): List[A] =
    as.foldLeft(List.empty[A])((newAs, a) => a :: newAs)
}
