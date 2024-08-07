fun main(args: Array<String>) {
    // There are 3 collections that are List, Set and Maps, out of which few are mutable and some are immutable
    // Im-mutable List :-
    val names = listOf<String>("Hindvi ", "Vedant ", "Vishal ", "Vedant")
    println(names[0])
    names.forEach { print(it) }
println("\n")

    //Mutable List :-
    val Namaewa = mutableListOf<String>("Aakanksha", "Shubham", "Pol")
    Namaewa.add("Kunal")
    Namaewa.removeAt(0)
    Namaewa.remove("Pol")
    Namaewa.forEach {println(it)}
    println("\n")

    //Im-Mutable Set :-
    val Freshers = setOf<String>("Vishal", "Kunal", "Gaurav", "Soham", "Vedant", "Shubham", "Hindvi", "Akanksha", "Vedant")
    Freshers.forEach { println(it) }
    println("\n")

    //Mutable Set:-
    val FresherMembers =mutableSetOf<String>("Vishal", "Kunal", "Gaurav", "Soham", "Vedant", "Shubham", "Hindvi", "Akanksha", "Vedant")
    FresherMembers.add("Aditya")
    FresherMembers.forEach { println(it) }
    println("\n")

    //Mutable set using user objects :-
    val user1 = User("Name 1")
    val user2 = User("Name 2")
    val user3 = User("Name 3")
    val user4 = User("Name 4")
    val user5 = User("Name 5")
    val user6 = User("Vedant")
    val user7 = User("Vedant")

    val name = mutableSetOf<User>(user1, user2, user3, user4, user5, user6, user7)
    name.forEach { println(it.name) }
    println("\n")

    // Im-Mutable Maps:-
    val users = mapOf<Int, String>(1 to "Vedant", 2 to "Vishal", 3 to "Shubham")
    println(users[2])
    println("\n")

    // Mutable Map:-
    val fruits = mutableMapOf<Int, String>(1 to "Orange", 2 to "Apple", 3 to "Watermelon")
    fruits[5] = "Mango"
    fruits.remove(1)
    fruits.forEach { t, u -> println("$t and $u") }

}

data class User(val name: String)