fun main(args: Array<String>) {

    val numbers = listOf(1,2,3,4,5,6)
    println(numbers.get(0))
    println(numbers[0])
    println(numbers.getOrNull(7))
    println(numbers.getOrElse(7, {it}))
    println(numbers.indexOf(3))
    println(numbers.lastIndexOf(3))

    val nums = (0..12).toList()
    println(nums.subList(3,6))
}