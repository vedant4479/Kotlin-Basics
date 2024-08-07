fun main(args: Array<String>) {
    // Mapping :-
    val numbers = setOf<Int>(1, 2, 3, 4, 5)
    println(numbers.map {if (it == 3) it * 100 else it * 10})
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value  })
    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })
    println("\n")


    // Zipping :-
    val colors = listOf("Red", "Brown", "Grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors.zip(animals))
    println(colors zip animals)
    println(colors.zip(animals){color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())
    println("\n")


    // Association :-
    val num = listOf("one", "two", "three", "four")
    println(num.associateWith { it.length })
    println(num.associateBy { it.first().uppercase() })
    println(num.associateBy (keySelector = { it.first().uppercase() }, valueTransform = {it.length}))
    println("\n")


    //Flatten :-
    val numSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    for (nums in numSets){
        for (Num in nums){
            println(Num)
        }
        print("\n")
    }
    val numFlatten = numSets.flatten()
    for (NUM in numFlatten){
        println(NUM)
    }
    println("\n")


    // String Representation :-
    val numStrings = listOf("one", "two", "three", "four")
    println(numStrings)
    println(numStrings.joinToString())
    val listString = StringBuffer("The list of numbers: ")
    println(numStrings.joinTo(listString))
    println(numStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
    val NUMS = (1..100).toList()
    println(NUMS.joinToString (limit = 15, truncated = "<...>"))
    println(numStrings.joinToString { "Element: ${it.uppercase()}" })
    println("\n")


    //Filtering :-
    val numerals = listOf("one", "two", "three", "four")
    val longerThan3 = numerals.filter { it.length > 3 }
    println(longerThan3)
    val numMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
    val filteredMap = numMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filteredMap)
    val filteredIndex = numerals.filterIndexed { index, value -> (index != 0) && (value.length < 5)  }
    val filteredNot = numerals.filterNot { it.length <= 3 }
    println(filteredIndex)
    println(filteredNot)
    val mixedList = listOf(1, 2, 3, 'A','B', 'C', "143", "Hindavi", false)
    mixedList.filterIsInstance<String>().forEach {
        println(it)
    }
    println("\n")


    // Partition :-
    val (match, rest) = numerals.partition { it.length > 3 }
    println(match)
    println(rest)
    println(numerals.any { it.endsWith("e") })                     //Testing Predicates
    println(numerals.none { it.endsWith("w") })                  //Testing Predicates
    println(numerals.all { it.length > 1 })                                            //Testing Predicates
    println("\n")


    //Plus and Minus Operations :-
    val fruits = mutableListOf("Apple", "Banana", "Orange", "Watermelon")
    val plusList = fruits + "Litchi"
    val minusList = fruits - mutableListOf("Orange", "Watermelon")
    println(plusList)
    println(minusList)
    println("\n")


    // Grouping :-
    val Freshers = listOf("Vedant", "Vishal", "Shubham", "Kunal", "Gaurav", "Soham", "Hindavi", "Aakanksha", "Jay", "Ganesh")
    println(Freshers.groupBy { it.first().uppercase() })
    println(Freshers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))
    println("\n")


    // Retrieve Collection Parts:-
    val Animes = listOf("One Piece", "DBZ", "JJK", "Naruto", "MHA", "Bleach")
    println(Animes.slice(1..3))
    println(Animes.slice(0..4 step 2))
    println(Animes.slice(setOf(3, 5, 0)))

    println(Animes.take(3))
    println(Animes.takeLast(3))
    println(Animes.drop(1))
    println(Animes.dropLast(5))

    println(Animes.takeWhile { !it.startsWith("N") })
    println(Animes.takeLastWhile { it != "JJK" })
    println(Animes.dropWhile { it.length == 9 })
    println(Animes.dropLastWhile { it.contains("a") })

    val numbs = (0..13).toList()
    println(numbs.chunked(3))
    println(numbs.chunked(3) {it.sum()})

    val numbs2 = Animes
    println(numbs2.windowed(3))
    println("\n")


    // Retrieve Single Elements:-
    val mangas = listOf("Solo Leveling", "Omniscient Reader","Teenage Mercenary", "Unordinary", "Tower of God" )
    println(mangas.elementAt(3))
    println(mangas.first())
    println(mangas.last())
    println(mangas.first { it.length >15 })
    println(mangas.last { it.startsWith("U") })
    println(mangas.random())
    println(numbers.isEmpty())
    println("\n")


    // Aggregate Operations :-
    val sankhya = listOf(6, 10, 14, 4, 100)
    println("The sum is : ${sankhya.sum()}")
    println("The count is : ${sankhya.count()}")
    println("The average is : ${sankhya.average()}")
    println("The max value is : ${sankhya.maxOrNull()}")
    println("The min value is : ${sankhya.minOrNull()}")
    println("The sum is : ${sankhya.sumOf { it * 2 }}")
    println("\n")


    //Ordering :-
    val numerics = mutableListOf(2, 5, 1, 40, 20, 100, 60)
    numerics.sorted().forEach { println(it) }
    println("")
    val laptops = mutableListOf(
        Laptop("Dell", 2021, 4, 600),
        Laptop("Apple", 2022, 16, 1000),
        Laptop("Acer", 2020, 8, 800)
    )
    laptops.sorted().forEach { println(it) }
    println("")
//    laptops.sortedWith (ComparatorRam()).forEach { println(it) }
    laptops.sortedBy { it.ram }.forEach { println(it) }
    println("")
//    laptops.sortedWith(ComporatorYear()).forEach { println(it) }
    laptops.sortedWith (compareBy { it.year }) .forEach { println(it) }
    laptops.sortedWith (compareBy<Laptop> { it.year }.thenBy { it.price }) .forEach { println(it) }
    println("\n")


    //Linear Search :-
    //println(searchElement(17, mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 17, 18, 19, 20)))
    println("\n")


    //Binary Search:-
    println(binarySearch(8, mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 17, 18, 19, 20)))

}


data class Laptop(val brand: String, val year:Int, val ram: Int, val price:Int): Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        return if (this.price > other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            1
        } else if (this.price < other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            -1
        } else {
            0
        }
    }
}

//class ComparatorRam(): Comparator<Laptop>{
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.ram > laptop2.ram){
//            return 1
//        } else if (laptop1.ram < laptop2.ram) {
//            return -1
//        } else {
//            return 0
//        }
//    }
//}

//class ComparatorYear(): Comparator<Laptop>{
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.year > laptop2.year){
//            return 1
//        } else if (laptop1.year < laptop2.year) {
//            return -1
//        } else {
//            return 0
//        }
//    }
//}

// Linear Search:-
//private fun searchElement(searchedElement: Int, numbers: MutableList<Int> ): Int {
//    var i = 0
//    for (number in numbers){
//        i++
//        println("Searched Number: $i times")
//        if (number == searchedElement) {
//            return number
//        }
//    }
//    return -1
//}

// Binary Search:-
//private fun binarySearch(searchedElement: Int, numbers: MutableList<Int>): Int {
//    var low = 0
//    var high = numbers.size - 1
//    var i = 0
//    while (low <= high) {
//        i++
//        println("Searched number: $i times")
//        val mid = (low + high) / 2
//        val cmp = numbers[mid].compareTo(searchedElement)
//        if (cmp < 0){
//            low = mid + 1
//        } else if (cmp > 0){
//            high = mid - 1
//        } else {
//            return numbers[mid]
//        }
//    }
//    return -1
//}
private fun binarySearch(searchedElement: Int, numbers: MutableList<Int>) = numbers[numbers.binarySearch(8)]