package com.scala99

import org.specs2.mutable.Specification
import P11._

class P11Spec extends Specification {

  "encodeModified" in {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must_==
      List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  }
}
