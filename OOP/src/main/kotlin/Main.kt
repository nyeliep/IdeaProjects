fun main() {
    val tesla = Car("tesla","Model Y","KCC 462G",0)
    println(tesla.model)
    tesla.start()
    println(tesla.speed)
    tesla.accelerate(50)
    println(tesla.speed)
    tesla.accelerate(40)
    println(tesla.speed)
    tesla.decelerate(50)
    println(tesla.speed)
    tesla.hoot()
    tesla.stop()

    var myBook = Book("Born a crime", "Trevor Noah",288,"Spiegel and Grau")
    println(myBook.title)
    println(myBook.author)

}
class Car(var make:String, var model:String, var registration:String, var speed:Int){
        fun start(){
            println("Vroom vroom ")
        }
        fun accelerate(acceleration:Int){
            speed += acceleration
        }
        fun decelerate(decelerate: Int){

            speed -= decelerate
        }
        fun hoot(){
            println( "beep beep")
        }
        fun stop(){
            speed = 0
        }
}
data class Book(var title: String,var author:String,var pages: Int,var publisher: String,){

}


