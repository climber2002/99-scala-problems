package com.scala99

import org.specs2.mutable.Specification
import P01._

class P01Spec extends Specification {

  "last" in {
    last(List(1, 1, 2, 3, 5, 8)) must_==(8)

    last(List(8)) must_==(8)
  }
}
