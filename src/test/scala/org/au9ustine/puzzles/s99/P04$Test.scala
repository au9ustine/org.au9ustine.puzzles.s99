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

import org.scalatest.{Matchers, FlatSpec, FunSuite}

/**
 * Problem 04 Unit Testing
 *
 * Created by au9ustine on 4/22/15.
 */
class P04$Test extends FlatSpec with Matchers {

  "P04.length" should "fail if lst is null" in {
    intercept[NullPointerException] {
      P04.length(null)
    }
  }

  it should "get length of a list" in {
    P04.length((1 to 1000).toList) should be (1000)
  }

}
