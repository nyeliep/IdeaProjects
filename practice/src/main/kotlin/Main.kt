//fun main(args: Array<String>) {
//    sayHello("hi",*interestingThings)
//    greetPerson("hi", "Nyeliep")
//
//}
//      val interestingThings = arrayOf("Kotlin","Programming","Comic Books")
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(0))

//    for loop

//    for (interestingThing in interestingThings) {
//        println(interestingThing)
//    }

//    interestingThings.forEach{
//    println(it)
//    }


//     lambda syntax
//    
//    interestingThings.forEach {interestingThing ->
//        println(interestingThing)
//    }

//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }

//    val interestingThings = listOf("kotlin","programming","comic books")
//    interestingThings. forEach { interestingThing ->
//        println(interestingThing)
//    }
//
//    val  map = mapOf( 1 to "a", 2 to "b", 3 to "c",)
//    map.forEach { key, value -> println("$key -> $value") }

//    val  map = mutableMapOf( 1 to "a", 2 to "b", 3 to "c",)
//    map.forEach { key, value -> println("$key -> $value") }
//    map.put(4,"d")
//

//    val interestingThings = mutableListOf("kotlin","programming","comic books")
//    interestingThings.add("anime")
//    println(interestingThings)
//
//    for (interestingThing in interestingThings){
//        println(interestingThing)
//    }

//    fun sayHello(greeting:String, vararg itemsToGreet:String){
//        itemsToGreet.forEach{ itemToGreet ->
//            println("$greeting $itemToGreet")
//        }
//    }
//fun greetPerson(greeting:String, name:String) = println("$greeting $name")

fun main(args: Array<String>){
    val person = Person()
//    person.firstName
//    person.lastName
//    person.nickName = "Midnight"
//    person.nickName = "new Nickname"
//    println(person.nickName)
    person.printInfo()



}
class Person(val firstName:String = "Peter", val lastName:String = "Pan"){

    var nickName: String? = null
        set(value) {
          field = value
          println("the new nickName is $value")
        }
        get() {
            println("the return value is $field")
            return field
        }
    fun printInfo(){
//        val nickNameToPrint = if(nickName !=null)nickName else "no nickname"
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName($nickNameToPrint) $lastName")
    }
}






