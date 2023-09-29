package lab_3.option_2.task_5

object Remover {
  def removeAllConsonants(): Unit = {
    val text = "Hello to all my friends"
    val result = text.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "")
    println(result)
  }

}

object Main extends App {
  Remover.removeAllConsonants()
}
