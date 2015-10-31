package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 21 Unit Testing
 *
 * Created by au9ustine on 10/31/2015.
 */
class P21$Test extends FlatSpec with Matchers {

  "P21.insertAt" should "insert an element at a given position into a list."  in {
    val (elem, n, lst) = ('new, 1, List('a, 'b, 'c, 'd))
    val expected = List('a, 'new, 'b, 'c, 'd)
    P21.insertAt(elem, n, lst) should be (expected)
  }

}