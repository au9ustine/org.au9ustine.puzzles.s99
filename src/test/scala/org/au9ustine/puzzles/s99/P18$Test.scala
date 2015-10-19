package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 18 Unit Testing
 *
 * Created by au9ustine on 10/19/2015.
 */
class P18$Test extends FlatSpec with Matchers {

  "P18.slice" should "duplicate the elements of a list a given number of times"  in {
    val (i, k, lst) = (3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected =  List('d, 'e, 'f, 'g)
    P18.slice(i, k, lst) should be (expected)
  }

}

