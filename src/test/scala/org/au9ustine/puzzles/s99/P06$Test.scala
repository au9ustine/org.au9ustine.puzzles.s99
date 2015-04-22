/*
 * Copyright 2015 Shao Tian-Chen (Austin)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.au9ustine.puzzles.s99

import org.scalatest.{FlatSpec, Matchers}

/**
 * Problem 06 Unit Testing
 *
 * Created by au9ustine on 4/23/15.
 */
class P06$Test extends FlatSpec with Matchers {

  "P06.isPalindrome" should "fail if a list is null" in {
    intercept[NullPointerException] {
      P06.isPalindrome(null)
    }
  }

  it should "return true if it's a palindrome list" in {
    P06.isPalindrome(List(1, 2, 1)) should be (true)
    val lst = (1 to 50).toList ++ (50 to 1 by -1).toList
    P06.isPalindrome(lst) should be (true)
  }

  it should "return false if it's not a palindrome list" in {
    P06.isPalindrome(List(1, 2, 3)) should be (false)
    P06.isPalindrome(List(1, 2, 1, 2, 4)) should be (false)
    val lst = (1 to 100).toList
    P06.isPalindrome(lst) should be (false)
  }

}
