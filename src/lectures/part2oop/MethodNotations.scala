package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = "Wow!" // then space before ": String" is important
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom)) // equivalent

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS.
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with  - + ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive) // often use this one
  println(mary isAlive) // only can be used when the function don't have parameters

  // apply
  println(mary.apply())
  println(mary()) // equivalent

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

}
