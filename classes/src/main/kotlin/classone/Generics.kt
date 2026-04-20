package src.main.kotlin.classone

//Generics
fun main() {
    println(swapInt(1, 3))
    println(swapString("String-Um", "String-Two"))
    println(swapAnything("Um", 2))
    println(swapAnything(1.1, "Aura" ))
}

fun swapInt(numOne: Int, numTwo: Int) : Pair<Int, Int> {
    return Pair(numTwo, numOne)
}

fun swapString(stringOne: String, stringTwo: String) : Pair<String, String>{
    return Pair(stringTwo, stringOne)
}

fun <T> swapAnything(elementOne: T, elementTwo: T) : Pair<T, T> {
    return Pair(elementTwo, elementOne)
}