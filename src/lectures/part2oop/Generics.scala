package lectures.part2oop

object Generics extends App {
  class MyList[+A] {
    // use he type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
    A = Cat
    B = Dog = Animal
     */
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val ListOfStrings = new MyList[String]

  // generic methods
  object MyList {
    def emtpy[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.emtpy[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalLst: CovariantList[Animal] = new CovariantList[Cat]

  // animalList.add(new Dog) ??? HARD QUESTION => return a list of animal

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  // generic type needs proper bounced type
  //  val newCage = new Cage(new Car)

  // expand MyList to be generic

}
