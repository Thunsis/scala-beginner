package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()
  val anotherPerson = new Person()
  anotherPerson.greet()


}

// constructor
class Person(name: String, val age: Int = 0) {
  // body
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("Join Doe")
}
/*
  Novel nad a Writer

  Writer: first name, surname, year
   - method fullName

   novel: name, year of release, author
   - authorAge
   isWrittenBy(author)
   - copy (new year of release)  = new instance of Novel
 */

/*
  Counter class
   - receives an int value
   - method current count
   - method to increment/decrement => new Counter
   - overload inc/dec to receive an amount
 */

// class parameters are NOT FIELDS