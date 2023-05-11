import scala.annotation.tailrec

def concatenateString(string: String, n: Int): String = {
  @tailrec
  def loopString(n: Int, concatenatedString: String): String = {
    if (n <= 0) concatenatedString
    else loopString(n-1, concatenatedString+string)
  }
  loopString(n, "")
}
concatenateString("jumanji", 5)


def stringLength(string: String): Int = {
  ???
}

def isPrime(number: Int): String = {
  var flag: Boolean = false
  @tailrec
  def loopCount(count: Int): Unit = {
    if (count < number)
      if (number%count == 0) flag = true
      else loopCount(count+1)
  }
  loopCount(2)
  if (flag) "Not prime"
  else "Is Prime"

}
isPrime(13)




