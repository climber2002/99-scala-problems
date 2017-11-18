package com.scala99

/**
  * (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.
Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
object P09 {

  def pack[A](as: List[A]): List[List[A]] =
    as.foldRight(List.empty[List[A]]){ (a, ass) =>
      ass match {
        case Nil => List(List(a))
        case hs :: tail if hs.head == a => (a :: hs) :: tail
        case hs :: tail if hs.head != a => List(a) :: hs :: tail
      }
    }
}
