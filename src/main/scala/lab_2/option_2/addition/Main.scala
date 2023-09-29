package lab_2.option_2.addition

import scala.collection.mutable.ListBuffer


object Merger {
  def merge(firstList: List[Int], secondList: List[Int], buffer: ListBuffer[Int]): List[Int] = {
    if (firstList.nonEmpty) {
      buffer.addOne(firstList.head)
      merge(firstList.tail, secondList, buffer)
    } else if (secondList.nonEmpty) {
      buffer.addOne(secondList.head);
      merge(firstList, secondList.tail, buffer);
    } else buffer.toList;
  }

  def findElementsInOddPositions(list: List[Int]): Int = {
    if (list.isEmpty || list.length == 1) 0
    else
      list.tail.head + findElementsInOddPositions(list.tail.tail)
  }
}

object Main extends App {
  val list = Merger.merge(List(1, 2, 3, 4), List(5, 6, 7, 8), ListBuffer())
  println(list)
  println(Merger.findElementsInOddPositions(list))

}
