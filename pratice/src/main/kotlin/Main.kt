fun main(args: Array<String>) {

    greetPerson("Nyeliep")
    division(13,4)
    sum(8, 87,90)
    myself("I love piercings")
    multiplication(30,20)
    area(12,2)


}
    fun greetPerson(name: String){
        println("hi $name")

    }

fun division (num2: Int, num3: Int): Int{
    var result= num2.rem (num3)
    println("num2/num3: $result")
    return result
}
fun sum(num4: Int, num5: Int, num6: Int): Int{
    var sum= num4 + num5 + num6
    println(sum)
    return sum
}
fun myself(sentence:String){
    println("$sentence")
}
fun multiplication(num7: Int,num8: Int): Int {
    var multiplication = num7 * num8
    println(multiplication)
    return multiplication

}
//write a function that takes in the dimensions
//of the 2 shorter sides of a right angle triangle
//and return its perimeter

fun area(x: Int, y: Int): Int{
    var area= (1/2)*x*y
    println(area)
    return area


    // accessing string elements one by one
    var str = "Hello"
    println(str[0])
    println(str[1])
    println(str[2])
    println(str[3])
    println(str[4])
    // accessing the string elements using for loop
    var str2 = "Geeks"
    for(i in str2.indices){
        print(str2[i]+" ")
    }
}