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
 * Problem 07 Unit Testing
 *
 * Created by au9ustine on 4/23/15.
 */
class P07$Test extends FlatSpec with Matchers {

  "P07.flatten" should "turn hierarchical structure into a flatten list" in {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be
    List(1, 1, 2, 3, 5, 8)
  }

}
