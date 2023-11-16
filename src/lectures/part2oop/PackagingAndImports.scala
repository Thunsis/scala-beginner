package lectures.part2oop

import exercises.part2oop.Writer
import playground.{Cinderella => Princess, PrinceCharming}
import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  // package members are accessible by their simple name
  val writer = new Writer("John", "White", 2019)

  // import the package
  val princess = new Princess
  val anothorPrincess = new playground.Cinderella // playground.Cinderella = fully qualified name

  // packages are in hierarchy
  // matching folder structure

  // package object
  sayHello

  // imports
  val prince = new PrinceCharming

  val date = new Date
//  val sqlDate = new SqlDate

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ???
}
