package lab_2.option_2.task_2

import scala.annotation.tailrec

object Sum {

  @tailrec
  def getLastThreeDigit(list: List[Int]): List[Int] = {
    if (list.isEmpty) List()
    else if (list.length <= 3) list
    else getLastThreeDigit(list.tail)
  }

  def getSum(list: List[Int]): Int = {
    if (list.isEmpty) 0
    else list.head + getSum(list.tail)
  }
}

object Main extends App {
  val list = List(15, 32, -14, 64, -48, -32, 83, 79, -17, 85)
  println("Sum of last 3 elements: " + Sum.getSum(Sum.getLastThreeDigit(list)))
}