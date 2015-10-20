package org.au9ustine.puzzles.s99

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 19 Unit Testing
 *
 * Created by au9ustine on 10/20/2015.
 */
class P19$Test extends FlatSpec with Matchers {

  "P19.rotate" should "rotate a list N places to the left."  in {
    val (n1, lst1) = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val (n2, lst2) = (-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected =  List(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c),
      List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
    P19.rotate(n1, lst1) should be (expected.head)
    P19.rotate(n2, lst2) should be (expected(1))
  }

}