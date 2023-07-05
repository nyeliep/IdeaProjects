fun main(args: Array<String>) {
    val banker= Banker("Wilberforce",26)
    println( banker.name)
    banker.eat()
//    banker.sleep()
//    println( banker.countMoney(arrayOf(20,65,5,6,90)))
    banker.introduction()

    val doctor = Doctor("Chen",32)
    println( doctor.name)
    doctor.eat()
//    doctor.sleep()
//    doctor.treatPatient("Elizabeth","Typhoid")
    doctor.introduction()

    val farmer = Farmer("James",42)
    println( farmer.name)
    farmer.eat()
//    farmer.sleep()
//    farmer.cultivatedLand()
    farmer.introduction()

}
open class Person(var name: String,var age: Int){
    fun talk(words:String){
        println(words)
    }

    open fun eat(){
        println("yum")
    }

    fun sleep(){
        println("zzzzzz")
    }
    open fun introduction(){
        println("Hi, my name is $name")
    }

}


class Banker( name:String, age:Int):Person(name,age){

    fun countMoney(notes: Array<Int>):Int{
        return notes.sum()
    }

}

class Doctor( name:String,age:Int):Person(name,age){

    fun treatPatient(patient: String,disease:String){
        println("Treating $patient for $disease")
    }

    override fun introduction() {
//        super.introduction()
        println("Hi, my name is Dr. $name")
    }

}

class Farmer(name:String, age:Int):Person(name,age) {

    fun cultivatedLand(){
        println("dig dig dig")
    }

    override fun eat() {
//        super.eat()
        println("I am eating fresh veggies from my farm")
    }
    }
