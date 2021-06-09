package Interface

interface Exampleinterface {
    var myVar: Int // abstract property
    fun absMethod(): String // abstract method

    fun hello () {
        println("Heelo there")
    }
}
class Contoh : Exampleinterface {
    override var myVar: Int = 25
    override fun absMethod() = "Happey Learning"
}
fun main(args: Array<String>) {
    val obj = Contoh()
    println("My Varible Value is = ${obj.myVar}")
    obj.hello()

    print("Message from the Website")
    println(obj.absMethod())

}