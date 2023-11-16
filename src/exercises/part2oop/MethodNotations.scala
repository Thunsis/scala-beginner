package exercises.part2oop

import scala.language.postfixOps

object MethodNotations extends App {
  /*
  1. Overload the + operator
     mary + "the rockstar" = new person "Mary (the rockstar)"

  2. Add an age to the Person class
     Add a unary + operator => new person with the age + 1
     +mary => mary with the age incrementer

  3. Add a "learns" method in the Person scala => "Mary learns Scala"
     Add a learnsScala method, calls learns method with "Scala".
     Use it in post fix notation.

  4. Overload the apply method
     mary.apply(2) => "Mary watched Inception 2 times"
 */

  class Person(val name: String, val favoriteMovie: String, val age: Int) {
    def +(akka: String): Person = new Person(s"$name ($akka)", favoriteMovie, age)

    def unary_+(): Person = new Person(name, favoriteMovie, age + 1)
//    def unary_+(n: Int): Person = {
//      if (n <= 0) this
//      else unary_+.unary_+(n - 1)
//    }

    def learns(lecture: String ): String = s"$name learns $lecture"
    def learnsScala = this learns "Scala"

    def apply(n: Int):String = s"$name watched Inception $n times"

  }

  val mary = new Person("Mary", "Lock, Stock and Two Smoking Barrels", 26)
  println((mary + "student").name)
  println((mary + "student" + "now").name)
  println((+mary).age)
  println(mary learnsScala)
  println(mary.apply(2))
  println(mary(2))




}
