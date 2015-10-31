package org.au9ustine.puzzles.s99

import org.scalatest.{FlatSpec, Matchers}

/**
 * Problem 23 Unit Testing
 *
 * Created by au9ustine on 10/31/2015.
 */
class P23$Test extends FlatSpec with Matchers {

  "P23.randomSelect" should "extract a given number of randomly selected elements from a list."  in {
    val (n, lst) = (3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    val expected = List('e, 'd, 'a).size
    P23.randomSelect(n, lst).size should be (expected)
  }

}