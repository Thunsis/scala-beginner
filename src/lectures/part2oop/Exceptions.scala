package lectures.part2oop

object Exceptions extends App {
  val x: String = null
  //  println(x.length)

  // this will crash with a NPE
  // throwing and catching exceptions

  // 1. throwing exception
  //  val aWeirdValue = throw new NullPointerException

  // throwable classes extend the Throwable class.
  // Exception and Error are the major Throwable subtypes

  // 2. how to catch exception
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException(("No int for you!"))
    else 42

  try {
    // code that might throw
    getInt(true)
  } catch {
    case e: RuntimeException => println("caught a Runtime exception")
  } finally {
    // code that will get executed NO MATTER WHAT
    println("finally")
  }

//  try {
//    // code that might throw
//    getInt(true)
//  } catch {
//    case e: NullPointerException => println("caught a Runtime exception")
//  } finally {
//    // code that will get executed NO MATTER WHAT
//    println("finally")
//  }

  val potentialFail = try {
    // code that might throw
    getInt(false)
  } catch {
    case e: RuntimeException => 43
  } finally {
    // code that will get executed NO MATTER WHAT
    // optional
    // does not influence the return type of this expression
    // use finally only for side effects
    println("finally")
  }

  println(potentialFail)

  // 3. how to define your own exceptions
  class MyException extends Exception
  val exception = new MyException

  //  throw exception

  /*
    1. Crash your program with an OutOfMemoryError
    2. Crash with SOError
    3. PocketCalculator
       - add(x,y)
       - subtract(x,y)
       - multiply(x,y)
       - divide(x,y)

       Throw
         - overflowException if add(x,y) exceeds int.MAX_VALUE
         - underflowException if subtract(x,y) exceeds int.MIN_VALUE
         - MathCalculationException for division by 0
   */
}
