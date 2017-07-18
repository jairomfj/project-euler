package br.com.study

import org.junit.Assert.assertEquals
import org.junit.Test

/**
  * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
  * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
  * find the sum of the even-valued terms.
  */
class Problem2Test {

  @Test
  def execute10(): Unit = {
    assertEquals(4613732, Problem2.execute())
  }
}