package com.scala99

import org.specs2.mutable.Specification
import P21._

class P21Spec extends Specification {

  "insertAt" in {
    insertAt('new, 1, List('a, 'b, 'c, 'd)) must_==(List('a, 'new, 'b, 'c, 'd))
  }
}
