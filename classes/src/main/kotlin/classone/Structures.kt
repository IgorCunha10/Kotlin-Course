package classone

fun main() {
    //Structures
    println("Structures")
    println()

    //If-Else
    var a = 10
    var b = 15

    if (a > 10) {
        println("$a é maior que $b")
    } else {
        println("$b é maior que $a")
    }

    println()

    //When
    println("When")
    println()

    var c = 7
    when(c % 2) {
        0 -> println("$c É par")
        else -> println("$c é ímpar")
    }

    println()

    var velocity = 40
    when(velocity) {
        in 1..20 -> println("Primeira marcha")
        in 21..40 -> println("Segunda marcha")
        in 41..60 -> println("Terceira marcha")
        in 61..80 -> println("Quarta marcha")
        in 81..105 -> println("Quinta marcha")
        else -> println("Carro desligado")
    }

    //While
    println("While")
    println()

    var life = 10
    while (life > 0) {
        println("O jogador está com $life vidas")
        life -= 1
    }

    println()

    //Do-While
    println("Do-While")
    println()

    var tries = 0
    var diceNumber = 0

    do {
        tries += 1
        diceNumber = ((Math.random() * 6) + 1).toInt()

        println("Tentativa: $tries <-> Número aleatório: $diceNumber")
    } while (diceNumber != 6)

    println("Você tirou 6 após $tries tentativas")
    println()

    //For-In
    println("For-In")
    println()

    var students = arrayOf("Ethan", "Joe", "John", "Maxis", "Dylan")

    for(student in students) {
        println("$student está na turma de 2026")
    }

    println()

    var grades = arrayOf(7.6, 2.5, 6.5, 7.8, 10.0, -1.0)

    for (grade in grades) {
        if (grade < 0 || grade > 10) {
            println("Nota inválida")
        } else {
            println(grade)
        }
    }
}
