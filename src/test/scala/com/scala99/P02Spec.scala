package com.scala99

import org.specs2.mutable.Specification
import P02._

class P02Spec extends Specification {

  "penultimate" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) must_==(5)
  }

}
