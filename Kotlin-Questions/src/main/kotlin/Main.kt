fun main(args: Array<String>) {
  val person = Person("Nyeliep",21)
    person.speak()

    val vehicle = Vehicle("Thunderbird", "360w","white",2020)
    vehicle.start()
    val car = Car("cadillac","r34ws","lilac",2022)
    car.start()
    val rectangle = Rectangle(12,6)
    println( rectangle.area(12,6))

    val user = User("john", "Abc123")
    val isValidPassword = user.validatePassword() // true
    println(user.validatePassword())

//    if (user.validatePassword("password")) {
//        println("Password is valid!")
//    } else {
//        println("Password is invalid.")
//    }


}
//Create a class called Person with properties for name and age.
// Write a method called speak that prints "Hello, my name is {name} and I am {age} years old."
class Person(var name: String, var age: Int){

    fun speak(){
        println("Hello, my $name and I am $age years old.")
    }
}

//Create a data class called User with properties for username and password.
// Write a method called validatePassword that checks if the password contains at least one uppercase letter,
// one lowercase letter, and one number.
data class User(var username: String, var password: String) {
    fun validatePassword(): Any {
        val hasUpperCase = password.any { it.isUpperCase() }
        val hasLowerCase = password.any { it.isLowerCase() }
        val hasDigit = password.any { it.isDigit() }
        return hasUpperCase && hasLowerCase && hasDigit
    }
}

//fun validatePassword(): Boolean{
//    val regex = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+\$")
//    return regex.matches(password)

//Create a class called Vehicle with properties for make, model, and year.
// Write a method called start that prints "The {make} {model} is starting up."
open class Vehicle(var make: String, var model: String, var color: String, var year: Int){
   open fun start(){
        println("The $make $model is starting up")
    }
}

//Create a class called Car that extends Vehicle and adds a property for color.
// Override the start method to print "The {color} {make} {model} is starting up."
class Car(make: String,model: String, color: String, year: Int): Vehicle(make, model, color, year){
     override fun start(){
        println("The $color $make $model is starting up")
    }
}

//Create a class called Rectangle with properties for width and height.
// Write a method called area that returns the area of the rectangle.
class Rectangle(var width: Int, var height: Int){
    fun area(width: Int,height: Int): Int{
        var result = width * height
        return  result
    }

}

//Create a data class called Point with properties for x and y.
// Write a method called distance that takes another Point as an argument
// and returns the Euclidean distance between the two points.
data class Point(var x : Double, var y: Double)
fun distance(other: Point): Double{

}

//Create a class called Animal with properties for species and sound.
// Write a method called makeSound that prints "{species} says {sound}."

//Create a class called Dog that extends Animal and sets species to "dog" and sound to "woof".
// Override the makeSound method to print "{species} barks {sound}."

//Create a class called Cat that extends Animal and sets species to "cat" and sound to "meow".
// Override the makeSound method to print "{species} meows {sound}."

//Create a class called Person with properties for name and age.
// Write a method called introduce that prints "Hi, my name is {name} and I am {age} years old.