import scala.annotation.tailrec

//Write the following functions using recursion and tail recursion
//Return the sum of the numbers between two numbers a and b
//Calculate the nth fibonacci number
//Use the Fibonacci example to convince yourself only the
// tailrec solution is stack safe


def sumRecursive(a: Int, b: Int): Int = {
  if (a > b) 0
  else a + sumRecursive(a + 1, b)
}
println(sumRecursive(1, 6))

def sumTailRecursive(a: Int, b: Int): Int = {
  @tailrec
  def sumAccumulator(acc: Int, current: Int): Int = {
    if (current > b) acc
    else sumAccumulator(acc + current, current + 1)
  }
  sumAccumulator(0, a)
}
println(sumTailRecursive(1, 6))

def fibonacci(term : Int): Long = {
  @tailrec
  def loopFibonacci(secondPreviousTerm: Int, previous: Int, nextTerm: Int): Long = {
    if (nextTerm == term) previous + secondPreviousTerm
    else loopFibonacci(previous, previous + secondPreviousTerm, nextTerm + 1)
  }

  if(term == 0) 0L
  else if(term == 1) 1L
  else loopFibonacci(0, 1, 3)
}

println(fibonacci(6))
fibonacci(7)