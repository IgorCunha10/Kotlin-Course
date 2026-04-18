package classone

fun main() {
    //Collections
    println("Collections")
    println()

    //Array
    println("Empty Array")
    var emptyArray = arrayOf<String>()
    println(emptyArray)

    println()

    println("Array with items")
    var shoppingCart = arrayOf<String>("Coffee", "Rice", "Bean", "Fruits")
    for (item in shoppingCart) {
        println(item)
    }

    println()

    if (shoppingCart.isEmpty()) {
        println("The shopping cart is empty!")
    } else {
        println("The shopping cart has ${shoppingCart.size} items")
    }

    println()

    //List
    println("List")

    var movies = ArrayList<String>()
    movies.addAll(listOf("Spider-Man", "Matrix", "Jurassic Park"))
    println(movies)

    movies.add("Displacable Me")
    println(movies)

    movies.remove("Matrix")
    println(movies)
    println()

    if (movies.contains("Spider-Man")) {
        println("Spider-Man is in your movies list")
    }

    println()
    //Set
    println("HashSet")
    var moviesHashSet = HashSet<String>()
    var catalog = arrayOf("Inception", "Interstellar", "Godfather")

    moviesHashSet.addAll(catalog)
    println(moviesHashSet)
    println()

    for (movies in moviesHashSet) {
        println(movies)
    }

    println()

   //Map
    println("Map")
    var moviesMap = HashMap<Int, String>()
    var moviesCatalog = mapOf<Int, String>(Pair(1, "Back to the Future"),
                    Pair(2, "Evangelion"),
                    Pair(3, "Lion King"))

    moviesMap.putAll(moviesCatalog)
    println(moviesMap)

    println()
    for (movie in moviesMap) {
        println("Key => ${movie.key}")
        println("Movie => ${movie.value}")
    }

}