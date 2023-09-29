package lab_3.option_2.task_4

object Replacer {
  def replaceFirstAndLastWord(): Unit = {
    var text = "world is nice"
    val wordsArray = text.split(" ")
    val firstWord = wordsArray(0)
    val lastWord = wordsArray(wordsArray.length - 1)

    wordsArray(0) = lastWord
    wordsArray(wordsArray.length - 1) = firstWord

    wordsArray.toList.foreach(x => print(x + " "))
  }
}

object Main extends App {
  Replacer.replaceFirstAndLastWord()
}
