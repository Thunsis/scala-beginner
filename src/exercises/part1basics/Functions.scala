package exercises.part1basics


object Functions extends App {

  /*
  1. A greeting function (name, age => "Hi, my name is $name and I am $ age years old."
  2. Factorial function 1 * 2 * 3 * ... * n
  3. A Fibonacci function
     f(1) = 1
     f(2) = 1
     f(n) = f(n - 1) + f(n - 2)
  4. Tests if a number is prime.
  */

  def aGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(aGreetingFunction("Xuan", 25))

  def aFactorialFunction(n : Int): Int = {
    if (n <= 0) 1
    else n * aFactorialFunction(n - 1)
  }

  println(aFactorialFunction(3))


  def aFibonacciFunction(n : Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }

  println(aFibonacciFunction(10))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(20))

}
