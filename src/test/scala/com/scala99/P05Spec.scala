package com.scala99

import org.specs2.mutable.Specification
import P05._

class P05Spec extends Specification {

  "reverse" in {
    reverse(List(1, 1, 2, 3, 5, 8)) must_== List(8, 5, 3, 2, 1, 1)
  }

}
