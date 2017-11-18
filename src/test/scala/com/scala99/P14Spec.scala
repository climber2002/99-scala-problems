package com.scala99

import org.specs2.mutable.Specification
import P14._

class P14Spec extends Specification {
  "duplicate" in {
    duplicate(List('a, 'b, 'c, 'c, 'd)) must_== List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }
}
