package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 26 Unit Testing
 *
 * Created by au9ustine on 11/11/15.
 */
class P26$Test extends FlatSpec with Matchers {

  "P26.combinations" should "generate the combinations of K distinct objects chosen from the N elements of a list"  in {
    val (n, lst) = (3, List('a, 'b, 'c, 'd, 'e, 'f))
    val expected = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), List('a, 'b, 'f), List('a, 'c, 'd), List('a, 'c, 'e), List('a, 'c, 'f), List('a, 'd, 'e), List('a, 'd, 'f), List('a, 'e, 'f), List('b, 'c, 'd), List('b, 'c, 'e), List('b, 'c, 'f), List('b, 'd, 'e), List('b, 'd, 'f), List('b, 'e, 'f), List('c, 'd, 'e), List('c, 'd, 'f), List('c, 'e, 'f), List('d, 'e, 'f))
    val actual = P26.combinations(n, lst)
    actual should be (expected)
  }

}