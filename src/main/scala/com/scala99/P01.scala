package com.scala99

/**
  * Find the last element of a list.
  *
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
  */
object P01 {

  def last[A](as: List[A]): A = as match {
    case Nil => throw new Exception("Can't be Nil")
    case a :: Nil => a
    case h :: t => last(t)
  }
}
