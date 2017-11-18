package com.scala99

/**
  * Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
  */
object P02 {

  def penultimate[A](as: List[A]): A = as match {
    case a1 :: a2 :: Nil => a1
    case a1 :: a2 :: t => penultimate(a2 :: t)
    case _ => throw new Exception("too short")
  }
}
