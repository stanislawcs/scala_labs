package lab_3.option_2.add

import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.util.matching.Regex

object Second extends App {
  val text = "Stanislaw i s cool boy"
  val pattern = new Regex("\\w")

  val words = text.split(" ")

  for(i<-0 until words.length by 2){
    val result = pattern.replaceAllIn(words(i), x=>x.matched + x.matched)
    print(result + " " + words(i+1) + " ")
  }

}