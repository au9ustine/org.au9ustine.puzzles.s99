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
 *
 * Problem 14: Duplicate the elements of a list.
 *
 * Example:
 *
 * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
 * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
 */
object P14 {
  def duplicate[A](lst: List[A]): List[A] = lst.flatMap(x => List(x, x))
}
