class Cars (var name: String, var model: String, colour: String, doors: Int) {
    var colour = colour.trim()
    var doors = doors

    fun move() {
        println("The $name is moving")
    }

    fun stop() {
        println("The $name has stoped")
    }
}

class using(var firstName: String, var lastName: String, var age: Int){
    init {
        println("user: $firstName was created")
    }
}

class Calculator(){
    companion object {
        var max = 100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}

object DataBase {
    init {
        println("Database Created")
    }
}


//open class Vehicle(val name:String, val color:String){
//    open fun move(){
//        println("$name is moving")
//    }
//    open fun stop(){
//        println("$name is stopped")
//    }
//}
//class Car (name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color){
//
//}
//class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
//    override fun move() {
//        flying()
//        super.move()
//    }
//    fun flying(){
//        println("The plne is flying")
//    }
//}