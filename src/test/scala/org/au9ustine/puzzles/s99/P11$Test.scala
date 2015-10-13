package org.au9ustine.puzzles.s99

import org.scalatest.{FlatSpec, Matchers}

/**
 * Problem 11 Unit Testing
 *
 * Created by shaotch on 10/12/15.
 */
class P11$Test extends FlatSpec with Matchers {

  "P11.encodeModified" should "be able to encode modified run-length encoding."  in {
    val lst = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    P11.encodeModified(lst) should be (expected)
  }

}
