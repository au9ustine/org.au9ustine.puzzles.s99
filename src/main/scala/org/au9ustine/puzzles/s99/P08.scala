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
 * Problem 08: Eliminate consecutive duplicates of list elements.
 *
 * If a list contains repeated elements they should be replaced with a single
 * copy of the element. The order of the elements should not be changed.
 *
 * Created by au9ustine on 4/23/15.
 */
object P08 {
  def compress[A](lst: List[A]): List[A] = lst.foldRight(List[A]()) {
    (h, t) => t match {
      case lst_t if lst_t.isEmpty || !lst_t.head.equals(h) => h :: t
      case _ => t
    }
  }
}
