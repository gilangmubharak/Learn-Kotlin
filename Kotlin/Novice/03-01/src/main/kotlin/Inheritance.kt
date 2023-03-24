open class ABC {
    open fun think() {
        println("Hey Im Gilang Mubharak")
    }

    open val count: Int
        get() {
            TODO()
        }
}
class BCD: ABC() {
}
fun main () {
    var a = BCD()
    a.think()
}

