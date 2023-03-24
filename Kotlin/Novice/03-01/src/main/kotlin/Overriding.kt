open class BAC {
    open fun think () {
        println("Hey Im Gilang Mubharak")
    }
}
class CDE: ABC() {
    override fun think () {
        println("I am form Indonesia")
    }
}
fun main () {
    var a = CDE()
    a.think()
}