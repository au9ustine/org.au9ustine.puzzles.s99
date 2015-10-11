package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec, FunSuite}

/**
 * Problem 10 Unit Testing
 *
 * Created by shaotch on 10/11/15.
 */
class P10$Test extends FlatSpec with Matchers {

  "P10.pack" should "group duplicated word into lists of a list "  in {
    val lst = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    P10.encode(lst) should be (expected)
  }

}
