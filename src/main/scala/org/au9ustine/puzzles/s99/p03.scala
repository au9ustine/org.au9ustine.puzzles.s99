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
 * Problem 03: Find the Kth element of a list
 *
 * Created by au9ustine on 4/22/15.
 */
object p03 {
  def nth[A](lst: List[A], n: Int): A = n <= lst.size && n >= 0 match {
    case true => lst match {
      case null => throw new NullPointerException
      case _ => lst(n)
    }
    case _ => throw new NoSuchElementException
  }
}
