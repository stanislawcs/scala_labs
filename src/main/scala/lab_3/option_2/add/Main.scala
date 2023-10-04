package lab_3.option_2.add

object Main extends App{
  val text = "Stanislaw is cool boy"
  val pattern = "[aeiouAEIOU]".r
  val string = pattern.replaceAllIn(text,"")
  println(string)
}
