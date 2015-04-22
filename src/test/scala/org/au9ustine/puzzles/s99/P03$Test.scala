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

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 03 Unit Testing
 *
 * Created by au9ustine on 4/22/15.
 */
class P03$Test extends FlatSpec with Matchers {
  "P03.nth" should "fail if n is not qualified" in {
    intercept[NoSuchElementException] {
      P03.nth(List(1, 2, 3), 4)
      P03.nth(List(1, 2, 3), -1)
    }
  }

  it should "fail if lst is null" in {
    intercept[NullPointerException] {
      P03.nth(null, 0)
    }
  }

  it should "get nth element from a list if all params are qualified" in {
    P03.nth(List(1, 2, 3), 0) should be (1)
    P03.nth((0 to 100).toList, 100) should be (100)
  }
}
