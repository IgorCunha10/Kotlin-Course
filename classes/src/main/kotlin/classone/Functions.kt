package classone

fun main() {

    println("Welcome to our Kotlin program")
    sayHello()

    println("Type a number:")
    var a = readln().toInt()

    println("Type another number:")
    var b = readln().toInt()

    sumNumbers(a, b)
    say("Olá")
}

fun sayHello() {
    println("Type your name:")
    var userName : String = readln()
    println("Hello $userName")
}

fun sumNumbers( a: Int,  b: Int) {
    var sum = a + b

    return println("The sum of the numbers you typed is: $sum")
}

fun say(message: String) {
    println(message)
}