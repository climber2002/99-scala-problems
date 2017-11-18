package com.scala99

import org.specs2.mutable.Specification

class P04Spec extends Specification {

  "length" in {
    P04.length(List(1, 1, 2, 3, 5, 8)) must_== 6
  }
}
