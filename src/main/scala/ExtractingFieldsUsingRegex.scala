import scala.util.matching.Regex

object ExtractingFieldsUsingRegex {

  def main(args: Array[String]): Unit = {

    val line = "root:x:0:0:root:/root:/bin/bash"

    val regex = """([^:]+):(x):([0-9]{1}):([0-9]{1}):([^:]+):(/[^:]+):(/[^:]+)""".r

    val regex(username, password, userid, groupid, description, homeDirectory, shell) = line
    println("Username: " + username)
    println("Password: " + password)
    println("User ID: " + userid)
    println("Group ID: " + groupid)
    println("Description: " + description)
    println("Home Directory: " + homeDirectory)
    println("Shell: " + shell)
  }

}
