fun main() {
    school()
    var ann = Person("akech",48)
    println(ann)
   word("i love my school and i am a perfectionist")
    detail("ann")
    detail("nyeliep")
    stmt("tek","job","Akech","Giel")
    places()
    number()

    names("ann","ajaja","w")



}
fun school(){
    var name="akirachix"
    println(name[1])
    println(name[3])
    println(name[4])
    println("${name[1]} ${name[3]} ${name[4]}")

}
fun Person(name:String,age:Int):String{
    return ("Hi, my name is $name and i am $age years old.")
}
fun word(print:String){
 println(print.length)

}
fun detail(name:String){
  if (name=="ann"){
      println("that's me")
  }else{
      println("i don't know who that is")
  }


}
fun stmt(name1:String,name2:String,name3:String,name4:String){
    var x = arrayOf(name1,name2,name3,name4)
    println(x.contentToString())
}
fun places(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities.map { it.capitalize() })
    println(cities.sortedArray().contentToString())

}
fun number(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    print(numbers.sortedArray().contentToString())
}
fun names(name1: String,name2: String,name3: String):Array< String > {
    var x = arrayOf(name1,name2,name3)
    return x
}
