fun main(args: Array<String>) {
//    var x = 5
//    val y = 3.0
//    var result = x + y
//    println("x + y = ${x + y}")
//    println("x - y = ${x - y}")
//    println("x * y = ${x * y}")
//    println("x / y = ${x / y}")
//    println("x % y = ${x % y}")

//    result += 3
//    println("Result  = $result")
//
//    result -= 3
//    println("Result  = $result")
//
//    result *= 3
//    println("Result  = $result")
//
//    result /= 3
//    println("Result  = $result")
//
//    result %= 3
//    println("Result  = $result")
//
//    x = 0
//    println("x = ${x++}")
//    println("x = ${++x}")

//    var myNumber = 100
//    if (myNumber > 150) {
//        println("Greater than 150")
//    }
//    else if(myNumber > 90){
//        println("Greater than 90")
//    }
//    else {
//        println("All conditions failed")
//    }
//    val isActive = true
//    if (!isActive){
//        println("User is Active")
//    }
//    else{
//        println("User is Inactive")
//    }
//
//
//    val isPlaying = true
//    val score = 180
//    if(isPlaying && score >= 100){
//        println("Advance to Next level")
//    }
//    else{
//        println("Not eligible for next level")
//    }
//
//    val num1 = 5
//    val num2 = -3
//    if(num1>0||num2>0){
//        println("the condition is true")
//    }
//    else{
//        println("The condition is False")
//    }
//
//    val text = if(num1>0||num2>0){
//        println("the condition is true")
//        "This is Text 1"
//    }
//    else{
//        println("The condition is False")
//        "This is text 2"
//    }
//    println("$text")


    val n = 5
    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..(i)) {
            print(k)
        }
        println()
    }
}