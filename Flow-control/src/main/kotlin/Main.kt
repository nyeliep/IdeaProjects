import java.util.*

fun main(args: Array<String>) {
    ageClassifier(1)
    ageClassifier(3)
    ageClassifier(17)
    ageClassifier(19)
    countries("Rwanda")
    countries("Portugal")
    countries("Wales")
    countries("Ghana")

    var languages = arrayOf("Zulu","Kiswahili","Luganda","Kinyarwanda")
    for (lang in languages){
        println("I can speak $lang")
    }

    for( x in 64..74){
        println(x*x)
    }

    val name ="Adalab"
    for (char in name){
        println(char)
    }
    numbers(arrayOf(65,64,23,44,98,20,11))


}
fun ageClassifier(age:Int){
    when(age){
        in 0..1 -> println("you're a baby")
        in 2..3 -> println("you're a toddler")
        in 4..17 -> println("you're a child")
        else -> println("you're an adult")
    }
//    if (age in 0..1){
//        println("you're a baby")
//    }
//    else if( age in 2..3){
//        println("you're a toddler")
//    }
//    else if(age in 4..17){
//
//        println("you're a child")
//    }
//    else{
//        println("you're not an adult")
//    }
}
//write a function that takes in a country  name and
//prints out the corresponding nationality for
//each of the following countries:
//Rwanda, Ghana, Portugal, Wales, and other country
//should default to "not applicable"

fun countries(country:String ){
    when(country){
        in "Rwanda"-> println("Rwandese")
        in "Ghana" -> println("Ghanian")
        in "Portugal" -> println("portugues")
        in "Wales" -> println("Walsh")
        else -> println("not applicable")
    }
    }

//write a function that takes in an array of
//random integers and prints out
//whether each is odd or even

fun numbers(nums:Array<Int>) {
    for (num in nums){
        if (num %2 == 0) {
            println("even")
        } else {
            println("odd")
        }
    }

}

//write a function that takes in array of
//mixed types and return the sum of all
//the decimal elements


//fun main() {
//    println(sumOfNumbers(arrayOf(2.5, "Apples", 4.5, 8.5f, false)))
//}
//fun sumOfNumbers(mixed: Array<Any>): Double {
//    var sumNam = 0.0
//    for (x in mixed) {
//        if (x is Double) {
//            sumNam += x
//        } else if (x is Float) {
//            sumNam += x.toDouble()
//        }
//    }
//    return sumNam
//}







