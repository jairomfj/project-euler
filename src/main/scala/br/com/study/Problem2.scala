package br.com.study

object Problem2 {

  def execute(max: Long, value1: Long = 0, value2: Long = 1, evenSum: Long = 0): Long = {
    val result = value1 + value2
    if(result >= max) evenSum
    else if(result % 2 == 0) result + execute(max, value2, result, evenSum)
    else execute(max, value2, result, evenSum)
  }
}
