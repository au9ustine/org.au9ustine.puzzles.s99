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

import java.util.NoSuchElementException

/**
 * Problem 02: Find the last but one element of a list
 *
 * Created by au9ustine on 4/21/15.
 */
object P02 {
  def penultimate[A](lst: List[A]): A = lst.isEmpty match {
    case true => throw new NoSuchElementException
    case _ => lst.init.last
  }
}
