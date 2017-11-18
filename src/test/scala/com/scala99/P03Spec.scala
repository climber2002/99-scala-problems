package com.scala99

import org.specs2.mutable.Specification
import P03._

class P03Spec extends Specification {

  "nth" in {
    nth(2, List(1, 1, 2, 3, 5, 8)) must_==(2)
  }
}
