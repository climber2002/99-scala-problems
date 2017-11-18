package com.scala99

import org.specs2.mutable.Specification
import P22._

class P22Spec extends Specification {

  "range" in {
    range(4, 9) must_== List(4, 5, 6, 7, 8, 9)
  }
}
