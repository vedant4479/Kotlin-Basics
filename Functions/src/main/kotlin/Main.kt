fun main(args: Array<String>) {
    sayHello("Vedant", 21)

    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData("Some Data")
    } else {
        showMessage()
    }

    val max = getMax(15, 9)
    println(max)
    println(letMax(5, 9))
    println(letMax(15.6, 9.8))
    println(letMax(5, 12, 23))

    sendMessage(message = "You are Bot", name = "Vineet")
    sendMessage()

    println(sum(1,2,3,4,5,6,7,8,9))
}

//Creating functions
fun sayHello(name: String, age: Int) {
    println("Hello $name ! Your age is $age")
}

fun getData(data: String) {
    println("Your data is $data")
}

fun showMessage() {
    println("There is no Internet connection")
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun letMax(a: Int, b: Int): Int = if (a > b) a else b

//Function Overloading
fun letMax(a: Double, b: Double) = if (a > b) a else b
fun letMax(a: Int, b: Int, c: Int): Int {
    if (a >= b && a >= c) {
        return a
    } else if (b >= c) {
        return b
    } else {
        return c
    }
}

//Default Parameters in kotlin
fun sendMessage(name: String = "8-9-14-4-22-9", message: String = "9  12-15-22-5  25-15-21") {
    println("Name = $name and Message = $message")
}

//How to pass variable arguments in a function
fun sum(vararg numbers: Int): Int{
    var result = 0
    for (number in numbers){
        result += number
    }
    return result
}
