package lab_2.option_2.task_1

object SumOfNegativeNumbers {

  def filterList(): List[Int] = {
    val list = List(0, 15, 32, -14, 64, -48, -32, 83, 79, -17, 85)
    list.filter(x => x < 0)
  }

  def getSumOfNegativeNumbers(list: List[Int]): Int = {
    if (list.isEmpty) 0
    else
      list.head + getSumOfNegativeNumbers(list.tail)
  }

}

object Main extends App {
  val list = SumOfNegativeNumbers.filterList()
  println("Sum of negative numbers: " + SumOfNegativeNumbers.getSumOfNegativeNumbers(list))
}