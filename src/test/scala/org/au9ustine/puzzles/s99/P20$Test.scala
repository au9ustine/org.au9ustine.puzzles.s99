package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 20 Unit Testing
 *
 * Created by au9ustine on 10/21/2015.
 */
class P20$Test extends FlatSpec with Matchers {

  "P20.removeAt" should "remove the Kth element from a list."  in {
    val (n, lst) = (1, List('a, 'b, 'c, 'd))
    val expected =  (List('a, 'c, 'd),'b)
    P20.removeAt(n, lst) should be (expected)
  }

}