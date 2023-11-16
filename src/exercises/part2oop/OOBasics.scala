package exercises.part2oop

object OOBasics extends App {
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
  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  val republishNovel = novel.copyNovel(1868)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))
  println(republishNovel.authorAge)

  val counter = new Counter
  counter.increment.print
  counter.increment.increment.increment.print
  counter.increment(10).print

}

class Writer(firstName: String, surName: String, val year: Int) {
  def fullName(): String = s"$firstName $surName"
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  val authorAge = yearOfRelease - author.year
  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copyNovel(yearOfRelease: Int) = new Novel(this.name, yearOfRelease, this.author)
}

class Counter(count: => Int = 0) {
  val currentCount = this.count
  def increment = {
    println("incrementing")
    new Counter(count + 1)
  }
  def decrement = {
    println("decrementing")
    new Counter(count - 1)
  }

  def increment(n: Int): Counter = {
    if (n <= 0) this
    else increment.increment(n - 1)
  }

  def decrement(n: Int): Counter = {
    if (n <= 0) this
    else decrement.decrement(n - 1)
  }

  def print = println(count)

}

