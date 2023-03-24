open class CAB {
    open val count: Int = 0

    open fun think () {
        println("Gilang")
    }
}
class EDC:ABC() {
    override val count: Int

    init {
        count = 100
    }
    override fun think() {
        println("Fauzul")
    }
    fun displayCount() {
        println("Mubharak")
    }
}
fun main () {
    var a = EDC()
    a.displayCount()
}