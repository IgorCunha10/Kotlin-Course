package classone

fun main() {
    //Integer Type
    println("Integer types")

    //Long - 64 Bits, from - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    println("Long")
    println(Long.MIN_VALUE)
    println(Long.MAX_VALUE)

    println()

    //Int - 32 Bits, from -2147483648 to 2147483647
    println("Int")
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)

    println()

    //Short - 16 Bits, from -32768 to 32767
    println("Short")
    println(Short.MIN_VALUE)
    println(Short.MAX_VALUE)

    println()

    //Byte - 8 Bits, from -128 to 127
    println("Byte")
    println(Byte.MIN_VALUE)
    println(Byte.MAX_VALUE)

    println()

    //Decimal Types
    println("Decimal types")

    println()

    //Double
    println("Double")
    println(Double.MIN_VALUE)
    println(Double.MAX_VALUE)

    println()

    //Float
    println("Float")
    println(Float.MIN_VALUE)
    println(Float.MAX_VALUE)

    println()

    //Text Types
    println("Text Types")
    println()

    println("String")
    val name : String = "John"
    println(name)

    println()

    println("Char")
    val char : Char = 'A'
    println(char)

    println()

    //Boolean
    println("Boolean")
    var booleanVar: Boolean = true
    println(booleanVar)

    println()

    //Pair
    println("Pair")
    val(address, number) = Pair("SRL", 66)
    println(address)
    println(number)

    println()

    //Nullable Type
    println("Nullable Type")
    var driverLicense : String? = null
    println(driverLicense)

    driverLicense = "AB3345CDE"
    println(driverLicense)
 }