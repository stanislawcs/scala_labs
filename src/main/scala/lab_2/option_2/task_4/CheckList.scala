package lab_2.option_2.task_4

import scala.annotation.tailrec

object CheckList {

  @tailrec
  def checkToIncrease(list: List[Int]): Boolean = {
    if (list.isEmpty || list.length == 1) return false
    val temp = list.head
    val listOfBoolExpressions = list.tail.map(x => temp < x)
    val filteredList = listOfBoolExpressions.filter(x => x)

    if (filteredList.length != listOfBoolExpressions.length) {
      true
    } else {
      checkToIncrease(list.tail)
    }
  }


  @tailrec
  def checkToDecrease(list: List[Int]): Boolean = {
    if (list.isEmpty || list.length == 1) return false
    val temp = list.head
    val listOfBoolExpressions = list.tail.map(x => temp >= x)
    val filteredList = listOfBoolExpressions.filter(x => x)

    if (filteredList.length != listOfBoolExpressions.length) {
      true
    } else {
      checkToDecrease(list.tail)
    }
  }
}

object Main extends App {
  val list = List(1, 2, 3, 3, 2, 1)
  println(CheckList.checkToDecrease(list) && CheckList.checkToIncrease(list))
}
