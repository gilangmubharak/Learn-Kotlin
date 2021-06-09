package Interface

import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

interface A {
    fun printMe() {
        println("Ini Interface A")
    }
}
interface B {
    fun printMeToo() {
        println("Ini Interface B")
    }
}
// Implements two intwrface
class Multiple: A, B

fun main(args: Array<String>) {
    val obj = Multiple()
    obj.printMe()
    obj.printMeToo()
}