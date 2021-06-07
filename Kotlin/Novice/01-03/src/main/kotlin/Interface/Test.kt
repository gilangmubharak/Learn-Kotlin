package Interface

interface A {
    fun printMe() {
        println("Method of interface A")
    }
}
interface B {
    fun printMeToo() {
        println("I am Another Method from interface B")
    }
}

//implements two interface A and B
class multipleInterfaceExample: A, B

fun main(args: Array<String>) {
    val obj = multipleInterfaceExample()
    obj.printMe()
    obj.printMeToo()
}