package lab_3.option_2.addition

object Main extends App {
  val text = "Greetings from Artem and Stanislaw!"
  val pattern = "[aeiouAEIOU]".r
  val string = pattern.findAllIn(text)
  println(s"Count of vowel letters: ${string.length}" )
}
