package com.scala99

/**
  * Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
  */
object P04 {

  def length[A](as: List[A]): Int = as match {
    case Nil => 0
    case h :: t => 1 + length(t)
  }

}
