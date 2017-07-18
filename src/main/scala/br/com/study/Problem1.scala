package br.com.study

object Problem1 {

  def execute(maxValue: Int, factors: Array[Int]): Int = {
    (0 until maxValue)
      .filter(value => factors.count(f => (value % f) == 0) > 0)
      .sum
  }
}
