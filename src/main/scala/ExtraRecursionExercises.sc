import scala.annotation.tailrec
//Concatenate a given string n times

def concatenate(value: String, numberOfTimes: Int): String = {
  if (numberOfTimes <= 0) "";
  else value + concatenate(value, numberOfTimes - 1)
}
concatenate("Rose", 5)



def stringTailRecursion(value: String, n: Int): String = {

  @tailrec
  def loop(value: String, numberOfTimes: Int): String = {
    if (numberOfTimes <= 0) ""
    else loop(value + value, numberOfTimes - 1)
  }
  loop(value, n)
}
stringTailRecursion("Hello", 3)
