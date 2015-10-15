package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 14 Unit Testing
 *
 * Created by shaotch on 10/15/15.
 */
class P14$Test extends FlatSpec with Matchers {

  "P14.duplicate" should "duplicate the elements of a list"  in {
    val lst = List('a, 'b, 'c, 'c, 'd)
    val expected = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    P14.duplicate(lst) should be (expected)
  }

}
