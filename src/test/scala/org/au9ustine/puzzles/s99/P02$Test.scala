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

import java.util.NoSuchElementException

import org.scalatest.{Matchers, FlatSpec}

/**
 * Problem 02 Unit Testing
 *
 * Created by au9ustine on 4/21/15.
 */
class P02$Test extends FlatSpec with Matchers {

  "P02.penultimate" should "fail if count of list items is less than 2" in {
    intercept[NoSuchElementException] {
      P02.penultimate(List())
      P02.penultimate(List(1))
    }
  }

  it should "pick the last but one element if given a " +
    "qualified list" in {
    P02.penultimate(List(1, 1, 2, 3, 5, 8)) should be (5)
  }

}
