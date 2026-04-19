package classone

fun main() {
    var numbers = arrayOf(1, 2, 3, 4, 5)



    val oddNumbers = numbers.filter { it % 2 != 0 }
    println("Odd numbers: $oddNumbers")

    //Map
    val multiplyNumbers = numbers.map { it * it }
    println("Square of numbers in the array: $multiplyNumbers")
    println()

    var names = arrayOf("Igor", "Leonard", "Joseph", "Hierro", "Abbe")
    val namesUppercased = names.map { (it.uppercase()) }
    println(namesUppercased)
    println()

    //Filter
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")
    println()

    val namesFiltered = names.filter { it.length < 5 }
    println(namesFiltered)
    println()
    //Reduce
    val sumNumbers = numbers.reduce {
        acc, it -> println("acc: $acc, it: $it")
        acc + it
    }

    println("Result of somatory: $sumNumbers")
    println()

    var transaction = arrayOf<Double>(100.0, 200.3, -22.0, 33.98, -154.90, -50.0, 15.0)

    var balance = transaction.reduce {
        acc,it -> println("Saldo: " + String.format("%.2f", acc) +
        " => Próximo lançamento: " + String.format("%.2f", it))

        (acc + it)
    }

    println()
    println("Financial Balance: " + String.format("%.2f", balance))


}