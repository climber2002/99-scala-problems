package com.scala99

/**
  * (*) Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:

scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */
object P20 {

  def removeAt[A](n: Int, as: List[A]): (List[A], A) = {
    val (as1, as2) = as.splitAt(n)
    (as1 ++ as2.tail, as2.head)
  }
}
