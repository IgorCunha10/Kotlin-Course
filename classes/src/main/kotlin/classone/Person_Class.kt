package classone

import java.time.LocalDate
import java.time.Period

class Person_Class {

    var name : String? = null
    var dateofBirth : LocalDate? = null
    var weight : Double? = null
    var height : Double? = null
    val age: Int
        get() {
            return Period.between(dateofBirth, LocalDate.now()).years
        }


    fun showData() {
        println("Name: $name")
        println("Date of Birth: $dateofBirth")
        println("Age: $age")
        println("Weight: $weight")
        println("Height: $height")

    }

//    fun showAge() : Int {
//
//        val age = Period.between(dateofBirth, LocalDate.now()).years
//        return age
//
//    }

}