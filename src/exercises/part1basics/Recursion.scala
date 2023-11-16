package exercises.part1basics

import scala.annotation.tailrec

object Recursion extends App {
/*
    1. Concatenate a string n times
    2. IsPrime function, tail recursive
    3. Fibonacci function, tail recursive
 */

  def aStringConcatenateTailRec(aString: String, n: Int): String = {
    @tailrec
    def helpFunction(aString: String, n: Int, accumulator: String): String =
      if (n <= 0) accumulator
      else helpFunction(aString, n - 1, aString + accumulator)

    helpFunction(aString, n, "")
  }

  println(aStringConcatenateTailRec("abc", 3))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean):Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailRec(n / 2, true)
  }

  println(isPrime(341))

  def aFibonacciFunction(n : Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(aFibonacciFunction(8))

}
