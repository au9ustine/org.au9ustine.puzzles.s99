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
 *  Problem 21: Insert an element at a given position into a list.
 *  Example:
 *
 *  scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
 *  res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
 */
object P21 {
  def insertAt[A](x: A, n: Int, lst: List[A]): List[A] = lst.take(n) ::: (x :: lst.drop(n))
}
