// Question 1
// long hand syntax
def sumLengthOfStrings(str1: String, str2: String, str3: String, str4: String, str5: String): Int = {
  str1.length + str2.length + str3.length + str4.length + str5.length
}
// short hand syntax
val anonymousSumLengthOfStrings = (str1: String, str2: String, str3: String, str4: String, str5: String) => str1.length + str2.length + str3.length + str4.length + str5.length

sumLengthOfStrings("Ain't", "nothing", "but", "a", "heartbreak")
anonymousSumLengthOfStrings("Ain't", "nothing", "but", "a", "heartbreak")


// Question 2
 val takesInReturnsFunction = (num:Int) => () =>  num
// same as
def alternative(num:Int) = {
  () => num
}

// Question 3

//val function: (String, (Int, (String => Int)) => Int) => (Int => Int)
//
//val f2 = (num: Int, f3) => f3 * num
//
//val function = (str: String, (f2(num:Int, f3(str): (String)=>Int)): (Int, (String)=>Int))=> Int) => (Int => Int)
//
//val function2 = (str: String, (f2(num:Int, f3(str): (String)=>Int))) => (num => num)
//println(function2("jumanji", f2(30,f3)))

val a = (str1: String) => str1.length

val b =  (num1: Int, a: (String => Int)) => num1

val c = (num2: Int) => num2

val d = (str2: String, b: (Int,(String => Int))) => c

print(d("Tom", b(3, a())))

//val e = (d : (String, (Int,(String => Int))) =>

//val e = d:(String, (Int, (String => Int)) => Int) => c(num3:Int)