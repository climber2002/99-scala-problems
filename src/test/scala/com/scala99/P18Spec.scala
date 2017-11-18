package com.scala99

import org.specs2.mutable.Specification
import P18._

class P18Spec extends Specification {
  "slice" in {
    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must_== List('d, 'e, 'f, 'g)
  }
}
