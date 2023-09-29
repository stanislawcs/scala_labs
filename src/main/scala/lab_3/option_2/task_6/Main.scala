package lab_3.option_2.task_6


object Remover {
  def removeEverySecondLetter(): Unit = {
    val text = "Hello to everybody"
    val words = text.split(" ")
    val result = words.map(x => x.zipWithIndex.collect { case (letter, index) if index % 2 == 0 => letter })
    val listOfWords = result.toList.map(x => x.toList.mkString)
    listOfWords.foreach(x => print(x + " "))
  }
}

object Main extends App {
  Remover.removeEverySecondLetter()
}
