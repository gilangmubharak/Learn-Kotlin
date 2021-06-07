package Interface

private val Any.myVar: String
    get() {
        TODO("Not yet implemented")
    }

interface ExampleInterface {
    var myVar: Int //abstract property
    fun absMethod(): String //abstract method

    fun  hello() {
        println("Hello there, Welcome")
    }
}
class interfaceImp : ExampleInterface{
    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning"
}
fun main(args : Array<String>) {
    val obj = InterfaceImp()
    println("My Varibale Value is = ${obj.myVar}")
    print("Calling hello():")
    obj.hello()

    print("Message from the Website")
    println(obj.absMethod())
}

private fun Any.absMethod(): Any? {
    TODO("Not yet implemented")
}

private fun Any.hello() {
    TODO("Not yet implemented")
}

fun InterfaceImp() {
}
