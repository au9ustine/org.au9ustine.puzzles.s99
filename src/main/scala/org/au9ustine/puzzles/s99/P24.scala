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
 *  Problem 24:  Lotto: Draw N different random numbers from the set 1..M.
 *  Example:
 *
 *  scala> lotto(6, 49)
 *  res0: List[Int] = List(23, 1, 17, 33, 21, 37)
 */
object P24 {
  def lotto(n: Int, m: Int): List[Int] = P23.randomSelect(n, 1.to(m).toList)
}