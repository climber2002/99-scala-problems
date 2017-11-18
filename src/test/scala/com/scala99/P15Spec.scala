package com.scala99

import org.specs2.mutable.Specification
import P15._

class P15Spec extends Specification {

  "duplicateN" in {
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) must_== List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }

}
