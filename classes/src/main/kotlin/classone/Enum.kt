package classone

//Enum Class
enum class Country {
    Australia,
    Denmark,
    Turkey,
    France
}

fun main () {

    var userCountry : Country? = null

    println()
    println("Type your country")
    var getUserCountry = readln().toString()

    when(getUserCountry) {
        "Australia" -> userCountry = Country.Australia
        "Denmark" -> userCountry = Country.Denmark
        "Turkey" -> userCountry = Country.Turkey
        "France" -> userCountry = Country.France
        else -> println("Country not found in our database.")
    }

    if (userCountry != null) {
        println("Cool. You live in $userCountry, a very nice country!")
    }
}