package org.au9ustine.puzzles.s99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Problem 25 Unit Testing
  *
  * Created by au9ustine on 10/31/2015.
  */
class P25$Test extends FlatSpec with Matchers {

   "P25.randomPermute" should "generate a random permutation of the elements of a list"  in {
     val lst = List('a, 'b, 'c, 'd, 'e, 'f)
     val expected = List('b, 'a, 'd, 'c, 'e, 'f)
     val actual = P25.randomPermute(lst)
     actual.toSet should be (expected.toSet)
     actual.size should be (expected.size)
   }

 }