package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahhaha")
  }
  /*
  equivalent with
  class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit = println("ahahahahhaha")
  }

  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
   */

  println(funnyAnimal.getClass)
  println(funnyAnimal.eat)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
    def sayBye: Unit = println(s"$name says: Bye.")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
    override def sayBye: Unit = println(s"Jim says: see you later.")

  }

  println(jim.sayHi)
  println(jim.sayBye)

  /*
    1. Generic trait Mypredicate[-T] with a little method test(T) => Boolean
    2. Generic trait MyTransformer[-A, B] with a method transform(A) => B
    3. MyList:
      - map(transformer) => MyList
      - filter(perdicate) => MyList
      - flatMap(transformer from A to MyList[B]) => MyList[B]

      class EvenPredicate extends MyPredicate[Int]
      class StringToIntTransformer extends MyTransformer[String, Int]

      [1,2,3].map(n * 2) = [2.4,6]
      [1,2,3,4].filter(n % 2) = [2,4]
      [1,2,3].flatMap(n => [n,n+1]) => [1,2,2,3,3,4]

   */

}
