package org.au9ustine.puzzles.s99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Problem 24 Unit Testing
  *
  * Created by au9ustine on 10/31/2015.
  */
class P24$Test extends FlatSpec with Matchers {

   "P24.lotto" should "draw N different random numbers from the set 1..M"  in {
     val (n, m) = (6, 49)
     val expected = List(23, 1, 17, 33, 21, 37).size
     P24.lotto(n, m).size should be (expected)
   }

 }