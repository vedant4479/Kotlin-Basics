//import kotlin.properties.ReadWriteProperty
//import kotlin.reflect.KProperty

fun main(args: Array<String>) {
//    val car1 = Car()
//    car1.name = "Omni"
//    car1.model = "SUV"
//    car1.colour = "White"
//    car1.doors = 4
//
//    println("Name = ${car1.name}")
//    println("Model = ${car1.model}")
//    println("Colour = ${car1.colour}")
//    println("Doors = ${car1.doors}")
//
//    car1.move()
//    car1.stop()
//    println("\n")

//    val car3 = Cars("Ford", "Mustang", "  Grey  ", 2)
//    println("Name = ${car3.name}")
//    println("Model = ${car3.model}")
//    println("Colour = ${car3.colour}")
//    println("Doors = ${car3.doors}")
//
//    car3.move()
//    car3.stop()
//
//println("\n")
//
//    val car2 = Car("Ford", "Mustang", "  Grey  ", 2)
//    println("Name = ${car2.name}")
//    println("Model = ${car2.model}")
//    println("Colour = ${car2.colour}")
//    println("Doors = ${car2.doors}")
//
//    car2.move()
//    car2.stop()

//    val user = User("Vedant", "Tambe", 21)
//    val friend = User("Vishal", "Ugalmugale", 20)
//    println("Name: ${user.name}")
//    println("Name: ${friend.name}")

//    val user = User("Vedant")
//    val friend = User(firstName ="Name", "Ugalmugale")
//    val user2 = User(age = 21, firstName = "Shubham", lastName = "Pol")
//    println("Name = ${user.firstName}")
//    println("LastName = ${user.lastName}")
//    println("Age = ${user.age}")
//    println("\n")
//    println("Name = ${friend.firstName}")
//    println("LastName = ${friend.lastName}")
//    println("Age = ${friend.age}")
//    println("\n")
//    println("Name = ${user2.firstName}")
//    println("LastName = ${user2.lastName}")
//    println("Age = ${user2.age}")

//    val user = using("Vedant", "Tambe", 21)
//    val friend = using(firstName ="Name", "Ugalmugale")
//    val user2 = using(age = 21, firstName = "Shubham", lastName = "Pol")
//    user2.firstName = "Aakanksha"
//    println(user.firstName)
//    println(user.lastName)
//    println(user.age)
//    println("\n")
//    println(friend.firstName)
//    println(friend.lastName)
//    println(friend.age)
//    println("\n")
//    println(user2.firstName)
//    println(user2.lastName)
//    println(user2.age)

//    user.favouriteMovie = "Weathering with You"
//    println("my favourite movie is: ${user.favouriteMovie}")

//    val result = Calculator.sum(5, 10)
//    Calculator.max
//    println(result)

//    val instance = DataBase.getInstance()
//    val instance2 = DataBase.getInstance()
//    println(instance)
//    println(instance2)

//    println(DataBase)
//    println(DataBase)

//    val user1 = using("Hindvi", "Thakur", 21)
//    val user2 by lazy {
//        using("User1", "lastName", 21)
//    }
//    println(user2.firstName)

//    println(Directions.WEST)
//    println(Directions.EAST)
//    println(Directions.NORTH)
//    println(Directions.SOUTH)

//    for (direction in Directions.values()){
//        println(direction)
//    }
//    println(Directions.NORTH.direction)
//    println(Directions.NORTH.distance)
//    println(Directions.NORTH.name)
//
//    Directions.WEST.printData()

//    val direction = Directions.valueOf("EAST")
//    when (direction) {
//        Directions.EAST -> println("The direction is East")
//        Directions.WEST -> println("The direction is West")
//        Directions.NORTH -> println("The direction is North")
//        Directions.SOUTH -> println("The direction is South")
//    }


//    val ListView = ListView(arrayOf("Vishal", "Shubham", "Rathod", "Kunal", "Gaurav", "Hindvi", "Tambe", "Aakanksha"))
//    ListView.ListViewItems().displayItem(5)


//    val accountName = Account("Vedant Tambe")
//    accountName.deposit(20000)
//    accountName.withdraw(5000)
//    accountName.deposit(-2000)
//    accountName.withdraw(-40000)
//    println("The remaining balance in the account is : ${accountName.calculateBalance()}")


//    val car = Car("BMW", "RED", 1, 4)
//    val plane = Plane("Boeing", "WHITE and BLUE", 4, 4)
//    car.move()
//    car.stop()
//    plane.move()
//    plane.stop()

//    val success = Result.Success("Success !")
//    val progress = Result.Progress("Progressing !")
//    getData(progress)


//    val car = Car("BMW", "Red", 1, 4)

//    val user1 = User("Vedant", "Tambe", 21)
//    val user2 = User("Vedant", "Tambe", 21)
//    println(user1 == user2)
//    println(user1)
//    println(user2)


    //Object Expression :-
//    val loginButton = Button("Login", 1232, object : OnClickListener{
//        override fun OnClick() {
//            // Login The User
//        }
//    })
//    val signUpButton = Button("SignUp", 4321, object : OnClickListener{
//        override fun OnClick() {
//            // Sign up the user
//        }
//    })

//    val user = User()
//    with(user) {
//        firstName = "Vedant"
//        lastName = "Tambe"
//    }
//    with(user){
//        println(firstName)
//        println(lastName)
//    }

}

//8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888//
// 888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888//

//Classes :-
//class Car {
//    var name = ""
//    var model = ""
//    var colour = ""
//    var doors = 0
//
//    fun move() {
//        println("The $name is moving")
//    }
//
//    fun stop() {
//        println("The $name has stoped")
//    }
//}

//Classes with parameters :-
//class Car (var name: String, var model: String, colour: String, doors: Int) {
//    var colour = colour.trim()
//    var doors = doors
//
//    fun move() {
//        println("The $name is moving")sf
//    }
//
//    fun stop() {
//        println("The $name has stoped")
//    }
//}

// Constructors:-
//class User (var firstName: String, var lastName: String = "Lastname", var age: Int = 0){
//    var name: String

    //Initializer Block :-
//    init {
//        if (name.lowercase().startsWith("v")){
//            this.name = name
//        }else{
//            this.name = "User"
//            println("The name doesn't start with the later 'A' or 'a' ")
//        }
//    }

    //Secondary Constructors :-
//    constructor(name: String): this(name, "Lastname", 0){
//        println("Second")
//    }
//    constructor(name: String, lastName: String): this(name, lastName, 0){
//        println("Third")
//    }
//}

//Getters and Setters :-
//class using(var firstName: String, var lastName: String, var age: Int){
////    var firstName = firstName
////        get() {
////            return "FirstName: $field"
////        }
////        set(value) {
////            println("$value was assigned to firstName property")
////            field = value
////        }
//
//    lateinit var favouriteMovie: String
//}

// Companion Object :-
//class Calculator(){
//    companion object {
//        var max = 100
//        fun sum(a: Int, b: Int): Int {
//            return a + b
//        }
//    }
//}


//Singleton :-
//class DataBase private constructor() {
//    companion object{
//        private var instance: DataBase? = null
//        fun getInstance(): DataBase? {
//            if (instance == null){
//                instance = DataBase()
//            }
//            return instance
//        }
//    }
//}
//object DataBase {
//    init {
//        println("Database Created")
//    }
//}

// Lazy Initialization :-
//class using(var firstName: String, var lastName: String, var age: Int){
//    init {
//        println("user: $firstName was created")
//    }
//}

// ENUM Classes:-
//enum class Directions(var direction: String, var distance: Int){
//    NORTH("north", 10),
//    SOUTH("south", 20),
//    EAST("east", 15),
//    WEST("west", 40);
//
//    fun printData() {
//        println("Direction = $direction and Distance = $distance")
//    }
//}

// Inner Classes:-
//class ListView(val items: Array<String>) {
//    inner class ListViewItems() {
//        fun displayItem (position: Int){
//            println(items[position])
//        }
//    }
//}

// Challenge 3 :-
//class Account(val accountName: String){
//    private var balance = 0
//    private var transactions = mutableListOf<Int>()
//    fun deposit(amount: Int){
//        if (amount > 0){
//            transactions.add(amount)
//            this.balance += amount
//            println("$amount deposited. The available Balance is : ${this.balance}")
//        } else {
//            println("The requested amount cannot be deposited !")
//        }
//    }
//    fun withdraw(withdrawl: Int){
//        if (-withdrawl < 0){
//            transactions.add(-withdrawl)
//            this.balance -= withdrawl
//            println("$withdrawl withdrawn. The available balance is : ${this.balance}")
//        } else {
//            println("The requested amount cannot be withdrawn !")
//        }
//    }
//    fun calculateBalance(): Int {
//        this.balance = 0
//        for (transaction in transactions){
//            this.balance += transaction
//        }
//        return this.balance
//    }
//}

// Inheritance :-
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


// Sealed Class :-
//fun getData(result: Result) {
//    when(result) {
//        is Result.Success -> result.showMessage()
//        is Result.Progress -> result.showMessage()
//        is Result.Error.NonRecoverableError -> result.showMessage()
//        is Result.Error.RecoverableError -> result.showMessage()
//    }
//}
//sealed class Result(val message: String) {
//    fun showMessage() {
//        println("Result: $message")
//    }
//    class Success (message: String): Result(message)
//    sealed class Error (message: String): Result(message){
//        class RecoverableError(exception: Exception, message: String): Error(message)
//        class NonRecoverableError(exception: Exception, message: String): Error(message)
//    }
//    class Progress (message: String): Result(message)
//}

//Abstract Class :-
//abstract class Vehicles {
//
//    abstract fun move()
//
//    abstract fun stop()
//
//}
//class Car (var name: String, var color: String, val engines: Int, val doors: Int): Vehicles(){
//    override fun move() {
//
//    }
//
//    override fun stop() {
//
//    }
//}

//Data Classes :-
//data class User(var firstName: String, var lastName: String, var age: Int){
//    override fun equals(other: Any?): Boolean {
//        if (this === other){
//            return true
//        }
//        if (other is User){
//            return this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
//        return "User(firstName = '$firstName', lastName = '$lastName', age = $age)"
//    }
//}


// Interfaces :- Commonly used behaviour shared among classes, but dont want to provide actual code written in the interface class
// Interface cannot have Constructors
//interface Engine {
//    fun startEngine()
//}
//
//class Car(val name: String, val color: String): Engine {
//    override fun startEngine() {
//        println("The Car is starting the engine !")
//    }
//}
//
//class Truck(val name: String, val color: String): Engine {
//    override fun startEngine() {
//        println("The Truck is starting the engine !")
//    }
//}
//
//class Plane(val name: String, val color: String): Engine {
//    override fun startEngine() {
//        println("The Plane is starting the engine !")
//    }
//}
//
//class Tesla(val name: String, val color: String): Engine{
//    override fun startEngine() {
//        println("Tesla is starting the engine !")
//    }
//}


// Object Expression:-
//class Button(val text: String, val id: Int, val OnClicklistener: OnClickListener)
//
//class ClickListener(): OnClickListener {
//    override fun OnClick() {
//
//    }
//
//}
//
//interface OnClickListener {
//    fun OnClick()
//}


// Delegation :-
//class App : A by FirstDelegate(), B by SecondDelegate() {
//    override fun print() {
//
//    }
//
//    override fun print2() {
//
//    }
//}
//
//interface A {
//    fun print()
//}
//
//interface B {
//    fun print2()
//}
//
//open class FirstDelegate: A {
//    override fun print() {
//
//    }
//}
//open class SecondDelegate : B {
//    override fun print2() {
//
//    }
//}


// Delegation with properties :-
//class User {
//    var firstName by FormatDelegate()
//    var lastName by FormatDelegate()
//}
//
//class FormatDelegate : ReadWriteProperty<Any?, String> {
//    private var formattedString: String = ""
//    override fun getValue(
//        thisRef: Any? ,
//        property: KProperty<*>
//    ): String {
//        return formattedString
//    }
//    override fun setValue(
//        thisRef: Any?,
//        property: KProperty<*>,
//        value: String
//    ) {
//        formattedString = value.lowercase()
//    }
//}

