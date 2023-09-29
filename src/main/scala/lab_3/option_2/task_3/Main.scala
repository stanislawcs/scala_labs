package lab_3.option_2.task_3

import scala.util.matching.Regex


object Replacer {
  def replace(): Unit = {
    val text = "one plus one is something"
    val pattern = new Regex("\\bone\\b")

    val result = pattern.replaceAllIn(text, "two")
    println(result)
  }


}

object Main extends App {
  Replacer.replace()
}
