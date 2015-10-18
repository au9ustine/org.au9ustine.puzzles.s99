package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 17 Unit Testing
 *
 * Created by au9ustine on 10/18/2015.
 */
class P17$Test extends FlatSpec with Matchers {

  "P17.split" should "duplicate the elements of a list a given number of times"  in {
    val (n, lst) = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected =  (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    P17.split(n, lst) should be (expected)
  }

}
