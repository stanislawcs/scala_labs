package lab_3.option_2.task_2


object Finder {
  def findWordsInText(): Unit = {
    val text = "Being quiet buetiful girl she never thought of buety"
    val pattern = "\\bbue\\w*\\b".r
    println(pattern.findAllIn(text).toList)
  }
}

object Main extends App {
  Finder.findWordsInText()
}
