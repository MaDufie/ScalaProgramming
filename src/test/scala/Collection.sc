//Tuple
val myTuple = (1, 2)
myTuple: (Int, Int) = (1, 2)

//Syntactic sugar for pair(tuple2)
val t2 = "John" -> 21
// same as
val t2 = ("John", 21)

val myTuple = ("Tom", "Dick", "Rick")
println(myTuple._1) //prints position one i.e "Tom"

// Array
val myArray = Array(1, 2, 3, 4)
println(myArray(0))
myArray(1) = 18
myArray.foreach(println(_))

val s = Seq(1,2,3,4,5,6)
val newSeq = s :+ 8
newSeq.foreach(println_)

val range1 - 1 until 10
val range2 = range1.map(el => el*el)
range2.foreach(println_)

//val evenNumbers = range1.filter(x => x % 2 == 0)
// same as
val evenNums = range1.filter(_ % 2 == 0)
evenNums.foreach(println_)
