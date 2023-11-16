package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println((!(1 == x)))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .. side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println((1 + 3))

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITHE THIS AGAIN

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println((aWeirdValue))

  // side effects: println(), whiles, reassigning

  // Code blocks
  // the value of the block is the value of its last expression, the content inside code blocks is not visible outside
  // instructions are executed(think java), expressions are evaluated(Scala)
  // in Scala we'll think in terms of expressions

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "goodbye"
  }
  // 1. difference between "Hello world"(a value type is string) vs println("Hello world")(a side effect expression type is unit)
}
