package org.au9ustine.puzzles.s99

import org.scalatest.{FlatSpec, Matchers}

/**
 * Problem 09 Unit Testing
 *
 * Created by au9ustine on 10/10/2015.
 */
class P09$Test extends FlatSpec with Matchers {

  "P09.pack" should "group duplicated word into lists of a list "  in {
    val lst = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List(
      List('a, 'a, 'a, 'a),
      List('b),
      List('c, 'c),
      List('a, 'a),
      List('d),
      List('e, 'e, 'e, 'e)
    )
    P09.pack(lst) should be (expected)
  }

}
