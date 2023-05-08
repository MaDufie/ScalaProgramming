import java.time.LocalDate
import java.time.format.DateTimeFormatter
import scala.ScalaReflectionException

// Three basic rules of ScalaReflectionException
//    Everything is an expression
//    Every value is an object
//    Every operation is a method call

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello from Scala")
    val x = 7
    val z = {
      val a = 7;
      a + 3
    }

    // curly brackets denote scope
    println(multiply(4, 5))
    printHello()
  }

  def multiply(a: Int, b: Int): Int = a * b

  def printHello(): Unit = println("Hello")
}