package com.scala99

/**
  * Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)

  */
object P07 {

  def flatten(as: List[Any]): List[Any] =
    as.foldRight(List.empty[Any])((a, newAs) => a match {
      case al : List[Any] => flatten(al) ++ newAs
      case _ => a :: newAs
    })
}
