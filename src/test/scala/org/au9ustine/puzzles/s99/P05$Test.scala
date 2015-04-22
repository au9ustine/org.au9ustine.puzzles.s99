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
 * Problem 05 Unit Testing
 *
 * Created by au9ustine on 4/23/15.
 */
class P05$Test extends FlatSpec with Matchers {
  "P05.reverse" should "fail if a list is null" in {
    intercept[NullPointerException] {
      P05.reverse(null)
    }
  }

  it should "return a reversed list given a qualified list" in {
    P05.reverse((1 to 100).toList) should be ((100 to 1 by -1).toList)
  }
}
