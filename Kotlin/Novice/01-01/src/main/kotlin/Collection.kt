fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4)
    println("First Elements of our List"+items.first())
    println("Last Element of our list"+items.last())
    println("Even Numbers of our list"+items.
    filter { it % 2 ==0 }) // return [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"]) // prints "1"

    val string = hashSetOf("a", "b", "c", "d")
    println("My Set Value are"+string)
}
