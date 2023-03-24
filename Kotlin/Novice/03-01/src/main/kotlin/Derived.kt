open class Base {
    init {
        println("Base Class")
    }
}
open class Child:Base() {
    init {
        println("Child Class")
    }
}
class GrandChild: Child() {
    init {
        println("Grand Child Class")
    }
}
fun main () {
    var a = GrandChild()
}