fun main() {
    var q=Queue(6)
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(7)
    q.enqueue(6)
    q.display()
    q.dequeue()
    q.dequeue()
    q.enqueue(3)
    q.enqueue(5)
    q.dequeue()
    q.enqueue(7)
    q.enqueue(8)
    q.enqueue(1)
    q.enqueue(3)
    q.enqueue(5)
    println(q.peek())
    println("----------")
    println(q.display())
}
class  Queue(var capacity:Int){
    var data = IntArray(capacity)
    var front=0
    var rear=0
    fun enqueue(item:Int){
        if (isfull()) {
            println("Queue is full")
            return
        }
        data[rear]=item
        rear++
    }
    fun dequeue():Int?{
        if(isempty()){
            println("Queue is empty")
            return null
        }
        var remove=data[front]
        for(i in front until rear -1) {
            data[i] = data[i + 1]
        }
        rear--
        return rear
    }
    fun isfull():Boolean{
        return  rear==capacity
    }
    fun isempty():Boolean{
        return front==rear
    }
    fun peek():Int?{
        if(isempty()){
            println("Queue is empty")
            return null
        }
        return data[front]
    }
    fun display(){
        if (isempty()){
            println("Queue is empty")
            return
        }
        for( i in front until rear) {
            println(data[i])
        }
    }
}