fun main(args: Array<String>) {
    val alarm = 7

    when (alarm) {
        12 -> println("The time is $alarm")
        7 -> println("The time is $alarm")
        14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }

    when (alarm) {
        in 1..10 -> println("The time is in range 1...10")
        12, 7, 14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }

   val text =  when (alarm) {
        in 1..10 ->{
            println("The time is in range 1...10")
            "text 1"
        }
        12, 7, 14 -> {
            println("The time is $alarm")
            "text 2"
        }
        else -> {
            println("The time is $alarm")
            "text 3"
        }
    }
    println("$text")

    val text1 = when {
        alarm <= 10 -> "The number is in the range 1...10"
        alarm == 11 || alarm == 12 -> "The time is $alarm"
        else -> "The time is $alarm"
    }
    println("$text1")

// Null value:-
    val word: String? = null
    if (word != null){
        println(word.length)
    }
    else{
        println("The variable is null")
    }
    //Shortcut for above part
    val name: String? = "Vedant"
    println(name?.length)


    
}