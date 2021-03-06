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
 *  Problem 09: Pack consecutive duplicates of list elements into sublists.
 *
 *  If a list contains repeated elements they should be placed in separate sublists.
 *
 *  Example:
 *
 *  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 *  res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 *
 */
object P09 {
  def pack[A](lst: List[A]): List[List[A]] = lst.foldLeft(List[List[A]]()) {
    (ret, x) => x match {
      case x_different if ret.isEmpty || x_different != ret.head.last => List(x) :: ret
      case _ => (x :: ret.head) :: ret.tail
    }
  }.reverse
}
