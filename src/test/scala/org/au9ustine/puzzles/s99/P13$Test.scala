package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 13 Unit Testing
 *
 * Created by shaotch on 10/14/15.
 */
class P13$Test extends FlatSpec with Matchers {

  "P13.encodeDirect" should "decode a run-length encoded list directly."  in {
    val lst = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    P13.encodeDirect(lst) should be (expected)
  }

}
