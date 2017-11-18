package com.scala99

import org.specs2.mutable.Specification
import P13._

class P13Spec extends Specification {

  "encodeDirect" in {
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must_==
      List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }

}
