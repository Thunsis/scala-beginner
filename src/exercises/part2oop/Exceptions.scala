package exercises.part2oop

object Exceptions extends App {

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
    // OOM
    // val array = Array.ofDim((Int.MaxValue))
    // SO
    // def infinite: Int = 1 + infinite
    // val noLimit = infinite
  class overflowException extends RuntimeException
  class underflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by 0")

  object PocketCalculator {

    def add(x: Int, y: Int) = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new overflowException
      else if (x < 0 && y < 0 && result > 0) throw new underflowException
      else result
    }

    def subtract(x: Int, y: Int) = add(x, -y)

    def multiply(x: Int, y: Int) = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new overflowException
      else if (x < 0 && y < 0 && result < 0) throw new overflowException
      else if (x > 0 && y < 0 && result > 0) throw new underflowException
      else if (x < 0 && y > 0 && result > 0) throw new underflowException
      else result
    }

    def divide(x: Int, y: Int) = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }
  }

//  println(PocketCalculator.subtract(Int.MinValue, 20))
    println(PocketCalculator.divide(30, 0))


}
