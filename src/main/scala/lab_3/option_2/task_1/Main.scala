package lab_3.option_2.task_1

object Main extends App {

  val text = "1+1=2"
  val regex = """\d+""".r

  val replacedText = regex.replaceAllIn(text, m => m.matched.toInt match {
    case 1 => "one"
    case 2 => "two"
    case _ => m.matched
  })

  println(replacedText)
}


