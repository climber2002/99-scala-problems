package com.scala99

import org.specs2.mutable.Specification
import P06._

class P06Spec extends Specification {

  "isPalindrome" in {
    isPalindrome(List(1, 2, 3, 2, 1)) must_==(true)

    isPalindrome(List(1, 2, 3, 4)) must_==(false)
  }
}
