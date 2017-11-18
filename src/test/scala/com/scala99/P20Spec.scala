package com.scala99

import org.specs2.mutable.Specification
import P20._

class P20Spec extends Specification {

  "removeAt" in {
    removeAt(1, List('a, 'b, 'c, 'd)) must_== (List('a, 'c, 'd),'b)
  }
}
