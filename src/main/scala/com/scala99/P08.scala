package com.scala99

/**
  * (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
object P08 {

  def compress[A](as: List[A]): List[A] =
    as.foldRight(List.empty[A]) { (a, newAs) =>
      newAs.headOption.map { head =>
        if(head == a) newAs
        else a :: newAs
      }.getOrElse(List(a))
    }
}
