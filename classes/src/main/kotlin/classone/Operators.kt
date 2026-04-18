package classone

fun main() {
    //Operators
    println("Operators")
    println()

    //Attribution
    println("Attribution: = ")
    var phrase = "Hello World!"
    println(phrase)

    println()

    //Arithmetics
    println("Arithmetics: +, -, *, /, %")
    val sum = 2 + 1
    val minus = 2 - 1
    val times = 2 * 2
    val division = 4 / 2
    val modulus = 4 % 3

    println("sum = $sum, minus = $minus, times = $times, division = $division, modulus = $modulus")

    println()

    //Compounds
    println("Compounds: +=, -=, *=, /=, %=, ++, --")
    val a = 2
    val b = 3
    var newValue = 5

    newValue += a
    println(newValue)
    newValue -= a
    println(newValue)
    newValue *= a
    println(newValue)
    newValue /= a
    println(newValue)
    newValue %= b
    println(newValue)

    newValue++
    println(newValue)

    newValue--
    println(newValue)

    println()

    //Logical Operators
    println("Logical Operators: &&, ||, !")
    val yes = true
    val no = false

    println("&& = ${yes && no}")
    println("|| = ${yes || no}")
    println("! = ${!yes && !no}")

    println()

    //Comparison Operators
    println("Comparison Operators: >, <, >=, <=, ==, !=")
    println("c = 10, d = 11, e = 5, f = 9")
    println()
    val c = 10
    val d = 11
    val e = 5
    val f = 9

    println(c > d)
    println(c < d)
    println(e >= f)
    println(e <= f)
    println(c == f)
    println(d != e)

    println()

    //Decision Structure in the same line

    println("Decision Structure in the same line")
    val grade = 7.6

    var result = if(grade >= 7) "Approved!" else "Reprobate!"

    println(result)
    println()

    //Null Coalescence
    var age: Int? = null
    println(age)

    age = 22
    println(age)
    println()

    //Closed Range && Half Closed Range
    println("Closed Range && Half Closed Range")

    val closed = 1..10
    val halfClosed = 1 until 10

    println("Closed Range:")
    for (num in closed) {
        println(num)
    }

    println("Half Closed Range:")
    for (num in halfClosed) {
        println(num)
    }

    println()


    

}