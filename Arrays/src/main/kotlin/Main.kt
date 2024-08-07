fun main(args: Array<String>) {
//    val names: Array<String> = arrayOf("John", "Sera", "Arlo")
//    val num = arrayOf(1, 2, 3, 4, 5, 6, 7, "Isen", "Remi")
//    names[0] = "Blyke"
//    println("The size of the array is: ${names.size}")
//    println("First Element: ${names[0]}")
//
//    for (i in num){
////        println(i)
//        if (i is String){
//            println(i)
//        }
//    }


//    val max = findMax(arrayOf(4, 6, 1, 8, 10, 34, 3, 6))
//    val min = findMin(arrayOf(4, 6, 1, 8, 10, 34, 3, 6))
//
//    println("Max Value = $max")
//    println("Min Value = $min")


    val max = findMinMax(arrayOf(20, 30, 10, 55, 65, 76, 47, 88, 26), true)
    val min =  findMinMax(arrayOf(20, 30, 10, 55, 65, 76, 47, 88, 26), false)

    println("The max value is: $max")
    println("The min value is: $min" )


}

//fun findMax (numbers: Array<Int>): Int {
//    var max = numbers[0]
//    for(number in numbers){
//        if (number > max){
//            max = number
//        }
//    }
//    return max
//}
//
//fun findMin (numbers: Array<Int>): Int {
//    var min = numbers[0]
//    for(number in numbers){
//        if (number < min){
//            min = number
//        }
//    }
//    return min
//}

fun findMinMax (numbers: Array<Int>, searchMax: Boolean): Int {
    var max = numbers[0]
    var min = max
    if (searchMax){
        for (number in numbers){
            if (number > max){
                max = number
            }
        }
        return max
    }else{
        for (number in numbers){
            if (number < min){
                min = number
            }
        }
        return min
    }
}