package com.scala99

/**
  * (**) Duplicate the elements of a list a given number of times.
Example:
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */
object P15 {

  def duplicateN[A](n: Int, as: List[A]): List[A] = {
    def prepend[A](n: Int, a: A, as: List[A]): List[A] =
      if(n == 0) as
      else prepend(n - 1, a, a :: as)

    as.foldRight(List.empty[A]) { (a, rs) =>
      prepend(n, a, rs)
    }
  }
}
