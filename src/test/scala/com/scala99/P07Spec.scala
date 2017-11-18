package com.scala99

import org.specs2.mutable.Specification
import P07._

class P07Spec extends Specification {

  "flatten" in {
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) must_==(List(1, 1, 2, 3, 5, 8))

    flatten(List(List(1, 1, List(List(3, 4))), 2, List(3, List(5, 8)))) must_==(List(1, 1, 3, 4, 2, 3, 5, 8))
  }

}
