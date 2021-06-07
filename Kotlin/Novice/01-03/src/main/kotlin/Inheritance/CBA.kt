package Inheritance

open class CBA {
    open fun think () {
    }
}
class BCD: CBA() {// inhertiance happens using defaults constructions}
    override fun think() {
    print("Iam from Child")
    }
}
fun main(args:Array<String>) {
    var a = BCD()
    a.think()
}