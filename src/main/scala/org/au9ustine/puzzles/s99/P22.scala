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

/**
 *  Problem 22:  Create a list containing all integers within a given range.
 *  Example:
 *
 *  scala> range(4, 9)
 *  res0: List[Int] = List(4, 5, 6, 7, 8, 9)
 */
object P22 {
  def range(a: Int, b: Int): List[Int] = a to b toList

  def rangeStreamed(a: Int, b: Int): List[Int] =
    Stream.from(a).take(b - a + 1).toList
}