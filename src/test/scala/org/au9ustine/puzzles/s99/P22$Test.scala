package org.au9ustine.puzzles.s99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Problem 22 Unit Testing
  *
  * Created by au9ustine on 10/31/2015.
  */
class P22$Test extends FlatSpec with Matchers {

   "P22.range" should "create a list containing all integers within a given range."  in {
     val (a, b) = (4, 9)
     val expected = List(4, 5, 6, 7, 8, 9)
     P22.range(a, b) should be (expected)
   }

 }