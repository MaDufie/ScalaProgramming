object CelsiusToFahrenheit {
  def main(args: Array[String]): Unit = {
    println(convertCelsius(10) + " fahrenheit")
  }

  def convertCelsius(celsius: Double): Double = {
    (celsius * 9 / 5) + 32
  }
}
