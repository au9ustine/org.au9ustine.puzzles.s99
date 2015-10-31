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
 *  Problem 23:  Extract a given number of randomly selected elements from a list.
 *  Example:
 *
 *  scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
 *  res0: List[Symbol] = List('e, 'd, 'a)
 */
object P23 {
  def randomSelect[A](n: Int, lst: List[A]): List[A] = {
    def randomSelect(n: Int, lst: List[A], random: Random): List[A] = {
      if (n <= 0) Nil
      else {
        val (rst, elem) = P20.removeAt(random.nextInt(lst.size), lst)
        elem :: randomSelect(n - 1, rst, random)
      }
    }
    randomSelect(n, lst, new Random())
  }
}