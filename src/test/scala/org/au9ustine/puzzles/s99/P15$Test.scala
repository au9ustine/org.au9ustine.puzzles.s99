package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 15 Unit Testing
 *
 * Created by au9ustine on 10/16/2015.
 */
class P15$Test extends FlatSpec with Matchers {

  "P15.duplicateN" should "duplicate the elements of a list a given number of times"  in {
    val (n, lst) = (3, List('a, 'b, 'c, 'c, 'd))
    val expected = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    P15.duplicateN(n, lst) should be (expected)
  }

}
