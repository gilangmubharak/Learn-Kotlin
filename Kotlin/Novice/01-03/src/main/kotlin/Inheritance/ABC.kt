package Inheritance

open class ABC {
    fun think () {
        print("Heyy")
    }
}
class BCA : ABC() {// inheritance happend using default constructor}
 fun main(args: Array<String>) {
        var a = BCA()
        a.think()
    }
}