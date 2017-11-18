package com.scala99

/**
  * (*) Insert an element at a given position into a list.
Example:
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */
object P21 {

  def insertAt[A](a: A, index: Int, as: List[A]): List[A] = {

    def go(a: A, index: Int, ass: (List[A], List[A])): (List[A], List[A]) = {
      val (as1, as2) = ass
      if(index == 0) {
        (as1, a :: as2)
      } else {
        go(a, index - 1, (as2.head :: as1, as2.tail))
      }
    }

    val (as1, as2) = go(a, index, (List.empty[A], as))
    as1.reverse ++ as2
  }
}
