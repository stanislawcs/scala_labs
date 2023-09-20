package lab_2.option_2.task_5

import scala.annotation.tailrec

object Duplicates {
  @tailrec
  def findTripleNonConsecutiveDuplicate(list: List[Int]): Unit = {
    if (list.isEmpty) return
    val temp = list.head

    val filteredList = list.tail.filter(x => x.equals(temp))
    val listWithoutDuplicates = list.tail.filter(x => x != temp)
    if (filteredList.length >= 2) {
      println(filteredList.head)
      findTripleNonConsecutiveDuplicate(listWithoutDuplicates)
    }
    else findTripleNonConsecutiveDuplicate(list.tail)
  }
}

object Main extends App {
  val myList = List(1, 6, 3, 4, 5, 4, 9, 5, 1, 3, 455, 3)
  Duplicates.findTripleNonConsecutiveDuplicate(myList)
}