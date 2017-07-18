package br.com.study

import org.junit.Test
import org.junit.Assert.assertEquals

/**
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  * The sum of these multiples is 23.
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
  */
class Problem1Test {

  @Test
  def execute10(): Unit = {
    val maxValue = 10
    val factors = Array[Int](3, 5)
    assertEquals(23, Problem1.execute(maxValue, factors))
  }

  @Test
  def execute100(): Unit = {
    val maxValue = 100
    val factors = Array[Int](3, 5)
    assertEquals(2318, Problem1.execute(maxValue, factors))
  }

  @Test
  def execute1000(): Unit = {
    val maxValue = 1000
    val factors = Array[Int](3, 5)
    assertEquals(233168, Problem1.execute(maxValue, factors))
  }

}
