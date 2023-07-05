import kotlin.io.path.createTempDirectory

fun main() {
val nums = mutableListOf(21,43,332,321,2,111,4,5)
    val evenList = nums.filter { num -> num%2==0 }
    println(evenList)


    val sortedNums = nums.sorted()
    println(sortedNums)
    println(nums is List<Int>)

intList()

    createProductList()

    numbers()


}
data class Product(var name:String, var price:Double)
    fun createProductList() {
        val kiwi = Product("Kiwi shoe polish", 80.0)
        val ilara = Product("Ilara milk", 30.0)
        val bread = Product("Sunblest", 65.0)
        val biscuit = Product("Nuvita", 5.0)
        val petroleumJelly = Product("Vaseline",50.0)

            val products = listOf(kiwi,ilara,bread,biscuit,petroleumJelly)
        val sortedProducts = products.sortedBy { product -> product.name  }
        var itemsICanAfford = products.filter { product -> product.price <= 50 }
        println(itemsICanAfford)
        println(sortedProducts)
    }










//write a function that takes in a list of integers
//prints out the square of each element

fun intList(){
    val numb = listOf(1,45,76,89,435,62,13,55,76,43)
    for (num in numb){
        println(num*num)
    }
}
fun numbers(){
    var myList = listOf(1,2,3,4,5,6,7,8,9,10)
    var filteredList = myList.filter { x -> x%2==0 }
    println("filtered List: ${filteredList}")
}