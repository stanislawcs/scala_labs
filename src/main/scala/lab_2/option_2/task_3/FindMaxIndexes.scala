package lab_2.option_2.task_3

import scala.annotation.tailrec

object FindMaxIndexes {

  def findAverage(list: List[Int]): List[Int] = {

    def sum(lst: List[Int]): Int = {
      if (lst.isEmpty) 0
      else lst.head + sum(lst.tail)
    }

    val summary = sum(list)
    val average = summary / list.length

    @tailrec
    def findMaxIndexes(list: List[Int], currentIndex: Int, result: List[Int]): List[Int] = {
      if (list.isEmpty) result
      else if (list.head > average)
        findMaxIndexes(list.tail, currentIndex + 1, result :+ currentIndex)
      else findMaxIndexes(list.tail, currentIndex + 1, result)
    }

    findMaxIndexes(list, 0, List.empty[Int])

  }


}

object Main extends App {
  val list = List(15, 32, -14, 64, -48, -32, 83, 79, -17, 85)
  println(FindMaxIndexes.findAverage(list))
}