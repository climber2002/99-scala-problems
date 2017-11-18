package com.scala99

import org.specs2.mutable.Specification
import P16._

class P16Spec extends Specification {

  "drop" in {
    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must_==
      List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }
}
