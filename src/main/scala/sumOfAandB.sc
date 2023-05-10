import scala.annotation.tailrec

def sumOfNumbers(a: Int, b: Int): Int ={
  if (a>b) 0
  else a + sumOfNumbers(a+1 , b)
}
sumOfNumbers(2, 5)
//2 + (2+1)
//5 + (3+1)
//9 + (4+1)
//14 + (5+1) -> answer
//20 + (6 -> greater than b so return 0

def tailRecursion(a: Int, b: Int): Int = {
  @tailrec
  def loop(a: Int, sum: Int): Int = {
    if (a > b) sum
    else loop(a+1, sum + a)
  }
  loop(a,0)
}
tailRecursion(2, 5)




def fibo(n: Int): Int = {
  if(n == 0) 0
  else if (n == 1) 1
  else fibo(n-1) + fibo(n-2)
}
fibo(6)

def fiboTailRecursion(n: Int): Int = {
  def loop(previous: Int, current: Int, nextPosition: Int): Int = {
    if (nextPosition > n) current
    else loop(current, previous + current, nextPosition + 1)
  }
  if (n==0) 0
  else if (n==1) 1

  loop(0, 1, 2)
}

fiboTailRecursion(6)







//5
//3
//2
//1
//1
//0

//cF(5-1) + (5-2) = (4) + (3) = 7
//cF(4-1) + (3-2) = (3) + (1) = 4
//
//
