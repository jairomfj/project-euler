package br.com.study

object Problem2 {

  def execute(value1: Long = 0, value2: Long = 1, sum: Long = 0): Long = {

    val result = value1 + value2
    if(result >= 4000000) sum
    else if(result % 2 == 0) result + execute(value2, value1 + value2, sum)
    else execute(value2, value1 + value2, sum)
  }
}
