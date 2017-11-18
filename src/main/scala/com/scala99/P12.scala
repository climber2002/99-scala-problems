package com.scala99

/**
  *  (**) Decode a run-length encoded list.
Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
Example:

scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  */
object P12 {

  def decode[A](ls: List[(Int, A)]): List[A] = {

    def prepend[A](n: Int, a: A, as: List[A]): List[A] = {
      if(n == 0) as
      else prepend(n - 1, a, a :: as)
    }

    ls.foldRight(List.empty[A]) {
      case ((n, a), as) => prepend(n, a, as)
    }
  }
}
