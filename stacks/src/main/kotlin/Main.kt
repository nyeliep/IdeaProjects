fun main(){
    var myStack = Stack()
    var string = "adalab"
    for (s in string){
        myStack.push(s)
    }

    var result = mutableListOf<Char>()
    while (!myStack.isEmpty()){
        result.add(myStack.pop()!!)
    }
    println(result.joinToString(""))
//    myStack.push(57)
//    myStack.push(67)
//    myStack.push(32)
//    myStack.push(45)
//    println(myStack.peek())
//    myStack.pop()
//    myStack.push(18)
//    var x = myStack.pop()
//    var y = myStack.pop()
//    var z = x!!+y!!
//    println(z)

}

class  Stack{
       var data = mutableListOf<Char>()


    fun push(value:Char){
        data.add(value)
    }

    fun pop():Char?{
       if (data.isEmpty()){
           return null
       }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Char?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }

    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}