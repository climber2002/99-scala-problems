package com.scala99

import org.specs2.mutable.Specification
import P08._

class P08Spec extends Specification {

  "compress" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must_==(List('a, 'b, 'c, 'a, 'd, 'e))
  }

}
