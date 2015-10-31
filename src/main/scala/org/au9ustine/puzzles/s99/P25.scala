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

import scala.util.Random

/**
 *  Problem 25: Generate a random permutation of the elements of a list.
 *  Hint: Use the solution of problem P23.
 *
 *  Example:
 *
 *  scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
 *  res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
 */
object P25 {
  def randomPermute[A](lst: List[A]): List[A] = Random.shuffle(0.until(lst.length).toList).map(lst(_))
}