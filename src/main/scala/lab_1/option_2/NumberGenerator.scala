package lab_1.option_2

import scala.util.Random

object NumberGenerator {

  def input(): String = {
    println("Input 10-digit number: ")
    var stringOfNumbers = ""

    try {

      stringOfNumbers = scala.io.StdIn.readLong.toString
      NumberGenerator.validate(stringOfNumbers)

    } catch {
      case nfe: NumberFormatException =>
        println("Number should be valid")
        sys.exit(0)
      case e: Exception =>
        println(e.getMessage)
        stringOfNumbers = NumberGenerator.makeStringLengthToNormalState(stringOfNumbers)
    }

    stringOfNumbers
  }

  def validate(stringOfNumbers: String): Unit = {
    if (stringOfNumbers.length != 10)
      throw new Exception("Number length should be 10 digits")
  }

  def makeStringLengthToNormalState(stringOfNumbers: String): String = {
    val random = new Random();

    if (stringOfNumbers.length() < 10) {
      stringOfNumbers.
        concat((1 to 10 - stringOfNumbers.length()).map(_ => random.nextInt(10))).mkString
    }
    else
      stringOfNumbers.substring(0, 10)

  }


  def generate(stringOfNumbers: String): Unit = {
    var z = 0
    var c = 0
    var numbers = stringOfNumbers

    for (i <- 1 to 5) {
      println("-----------------------")
      println("Numbers: " + numbers)
      var a = substringFromSymbolsAtEvenPositions(numbers).toInt
      var b = substringFromSymbolsAtOddPositions(numbers).toInt
      c = a * b
      c = abs(c)
      var rez = c.toString.substring(0, 3).toFloat / 1000
      z += c
      z = abs(z)
      println(s"a = $a")
      println(s"b = $b")
      println(s"c = $c")
      println(s"rez = $rez")
      println(s"z = $z")
      println("-----------------------")

      numbers = z.toString
    }

  }

  def substringFromSymbolsAtEvenPositions(stringOfNumbers: String): String = {
    var result = ""
    for (i <- 0 until stringOfNumbers.length by 2) {
      result = result.concat(stringOfNumbers.charAt(i).toString)
    }
    result
  }

  def substringFromSymbolsAtOddPositions(stringOfNumbers: String): String = {
    var result = ""
    for (i <- 1 until stringOfNumbers.length by 2) {
      result = result.concat(stringOfNumbers.charAt(i).toString)
    }
    result
  }

  def abs(num: Int): Int = {
    var number = num
    if (number < 0) {
      number = -number
    }

    number
  }
}


object Main extends App {
  NumberGenerator.generate(NumberGenerator.input())
}