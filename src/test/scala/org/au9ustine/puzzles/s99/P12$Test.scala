package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 12 Unit Testing
 *
 * Created by au9ustine on 10/13/2015.
 */
class P12$Test extends FlatSpec with Matchers {

  "P12.decode" should "decode a run-length encoded list."  in {
    val lst = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P12.decode(lst) should be (expected)
  }

}
