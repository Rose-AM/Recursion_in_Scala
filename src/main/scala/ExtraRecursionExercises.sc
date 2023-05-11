import scala.annotation.tailrec
//Concatenate a given string n times

def concatenate(value: String, numberOfTimes: Int): String = {
  if (numberOfTimes <= 0) "";
  else value + concatenate(value, numberOfTimes - 1)
}
concatenate("Rose", 5)


def stringTailRecursion(value: String, n: Int): String = {
  @tailrec
  def loop(acc: String, numberOfTimes: Int): String = {
    if (numberOfTimes <= 1) acc
    else loop(value + acc, numberOfTimes - 1)
  }
  loop(value, n)
}
stringTailRecursion("Hello", 3)


def lengthOfString (words: String) : Int = {
  @tailrec
  def loop(word: List[Char], counter: Int): Int = {
    if (word.isEmpty) counter
    else loop(word.tail, counter + 1)
  }
  loop(words.toList, 0)
}
lengthOfString("Hello")


def isPrime (n: Int): Boolean = {
  @tailrec
  def loop ( counter: Int ): Boolean = {
    if (counter <= 1) true
    else if (n%counter  == 0) false
    else loop(counter - 1)
  }
  if (n <= 1) false
  else loop(n-1)
}
isPrime(5)

//val emptyMap = Map[Int, String]
//val creators = Map("1" -> 2, "2" -> 3, "3" -> 4)
//for ( (k,v) <- creators ) println(s"$k, $v")



def countCharacters(s: String): Map[Char, Int] = {

  @tailrec
  def loop(characters: List[Char], mapOfXter: Map[Char, Int]): Map[Char, Int] = {
    if (characters.isEmpty) mapOfXter
    else {
      val currentXter = characters.head
      val counter = mapOfXter.getOrElse(currentXter, 0)
      val newMap = mapOfXter.updated(currentXter, counter + 1)
      loop(characters.tail, newMap)
    }
  }

loop(s.toList, Map.empty)
}
countCharacters("Hello")


def hasValidParenthesis(s:String): Boolean = {
  @tailrec
  def loop(parenthesis: List[String], counter: Int): Boolean = {
    val
    if (counter <= 0) true
    else{
     if (parenthesis.filter(_ == "("){

     }
      if ()
    }
  }

  if (s[0] != "(") false
  else loop((s.toString.toList), s.length)
}
