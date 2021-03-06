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
 * Problem 18: Extract a slice from a list.
 *
 * Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to
 * but not including the Kth element of the original list. Start counting the elements with 0.
 *
 * Example:
 *
 * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 * res0: List[Symbol] = List('d, 'e, 'f, 'g)
 */
object P18 {
//  def slice[A](i: Int, k: Int, lst: List[A]): List[A] = lst.slice(i, k)
  def slice[A](i: Int, k: Int, lst: List[A]): List[A] = lst.zipWithIndex.filter(x => i <= x._2 && x._2 < k).map(_._1)
}
