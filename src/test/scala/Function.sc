def myFunction(a:Int, b:Int) = a + b

// lambda function
val f : (Int, Int) => Int = (a:Int, b:Int) => {a+b} : Int
// f is equivalent to f1
val f1 = (a:Int, b:Int) => a+b

myFunction(2, 3)
print(f(3, 5))

// function that takes one integer and another function as parameters
def myHigherOrderFunction(num: Int, func: (Int) => func(num))
val anon1 = (num: Int) => num + 3
val anon2 = (num: Int) => num * num

println(myHigherOrderFunction(7, anon1))
println(myHigherOrderFunction(7, anon1))

// function literal explicitly
println(myHigherOrderFunction(7, x => x - 4))
// implicit better than explicit
println(myHigherOrderFunction(7, _ - 4))

// f compose g == f(g(x))
// f andThen g == g(f(x))
