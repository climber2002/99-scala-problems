package com.scala99

/**
  * (*) Split a list into two parts.
The length of the first part is given. Use a Tuple for your result.
Example:

scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  */
object P17 {

  def split[A](n: Int, as: List[A]): (List[A], List[A]) = {

    def go(n: Int, result: (List[A], List[A])): (List[A], List[A]) = {
      if (n == 0) result
      else {
        val as1 = result._1
        val as2 = result._2
        go(n - 1, (as2.headOption.map(_ :: as1).getOrElse(as1), as2.tail))
      }
    }

    val rs = go(n, (List.empty[A], as))
    (rs._1.reverse, rs._2)
  }
}
