import java.time.LocalDate
import java.time.format.DateTimeFormatter

object DateConverter {

  def main(args: Array[String]): Unit = {
    println(convertDate("18/11/05"))
  }


  def convertDate(dateString: String): String = {
    val myFormatter = DateTimeFormatter.ofPattern("dd/MM/yy")
    val date = LocalDate.parse(dateString, myFormatter)
    date.format(DateTimeFormatter.ofPattern("d MMMM yyyy"))
  }

}
