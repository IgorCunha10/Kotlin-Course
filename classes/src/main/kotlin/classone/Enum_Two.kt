package classone

enum class Month(month : Int) {
    january(1), february(2), march(3),
    april(4), may(5), june(6), july(7),
    august(8), septemeber(9), october(10),
    november(11), december(12)
}

fun main() {

    println("Months in a year:")

    Month.values().forEach {
        println(it)
    }

}