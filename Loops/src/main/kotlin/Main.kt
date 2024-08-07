fun main(args: Array<String>) {
//    for (i in 1..10){
//        println("i = $i")
//    }
//
//    for (j in 1 until 10) println("j = $j")

//    for (i in 10 downTo 1){
//        println(i)
//    }
//
//    for (j in 1 until 10 step 2){
//        println(j)
//    }


    var number = 0
//    while (number <= 20){
//        println(number)
//        number++
//    }
//
//    do {
//        println(number)
//    } while (number< 10)


//    while (number<20){
//        number++
//        if (number == 17){
//            continue
//        }
//        println(number)
//    }

//    while (number<10){
//        number++
//        if (number == 7){
//            break
//        }
//        println(number)
//    }

//    while (number<5) {
//        number++
//        println(number)
//        var i = 0
//        while (i < 5) {
//            if (i == 2){
//                break
//            }
//            i++
//            println("*")
//        }
//    }

//   outer@  while (number<5) {
//        number++
//        println(number)
//        var i = 0
//        while (i < 5) {
//            if (i == 3){
//                break@outer
//            }
//            i++
//            println("*")
//        }
//    }

    var num = 1
    val lastNum = 20
    var evenNumCount = 0
    while (num <= lastNum){
        num++
        if (!isEvenNum(num)){
            continue
        }
        evenNumCount++
        println(num)
    }
    println("Total Count of EvenNum is $evenNumCount")
}
//
fun isEvenNum(num: Int): Boolean{
    if ((num % 2) == 0)
        return true
    else
        return false
}