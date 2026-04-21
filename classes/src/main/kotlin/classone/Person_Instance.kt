package classone

import java.time.LocalDate
import java.time.LocalDate.*

fun main() {

    val person = Person_Class()
    person.name = "Donahoe"
    person.dateofBirth = of(2003, 6, 13)
    person.weight = 80.0
    person.height = 1.76

    val anotherPerson = Person_Class()
    anotherPerson.name = "John"
    anotherPerson.dateofBirth = of(1987, 8, 12)
    anotherPerson.weight = 75.0
    anotherPerson.height = 1.85

    println(person.showData())
    println()
    println(anotherPerson.showData())
    println()

}