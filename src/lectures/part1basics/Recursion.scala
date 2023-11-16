package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      var result = n * factorial((n - 1))
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
//  println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

    factHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factHelper(10, 1)
  = factHelper(9, 10 * 1)
  = factHelper(8, 9 * 10 * 1)
  = factHelper(7, 8 * 9 * 10 * 1)
  = ...
  = factHelper(2, 3 * 4 * ... * 10 * 1)
  = factHelper(1, 1 * 2 * 3 * ... * 10)
  = 1 * 2 * 3 * ... * 10
   */
//  anotherFactorial(5000)
  println(anotherFactorial(20000))

  // WHEN YOU NEED LOOPS, USE _TAIL RECURSION.

  /*
    1. Concatenate a string n times
    2. IsPrime function, tail recursive
    3. Fibonacci function, tail recursive
   */

}
