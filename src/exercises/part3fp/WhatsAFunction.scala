package exercises.part3fp

object WhatsAFunction extends App {
  /*
    1. a function which takes 2 strings and concatenates them
    2. transform the MyPredicate and MyTransformer into function types
    3. define a function which takes an int and returns another function which takes an int and return an int
      - what's the type of this function
      - how to do it
   */

  val concatenater: (String, String) => String = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = a + b
  }

  println(concatenater("Hello", "Scala"))

  // Function1
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int,Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val AnonymousSuperAdder = (x : Int) => (y: Int) => x + y

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4)) // curried function

  val adder4 = AnonymousSuperAdder(4)
  println(adder4(4))
  println(AnonymousSuperAdder(4)(4)) // curried function
}
