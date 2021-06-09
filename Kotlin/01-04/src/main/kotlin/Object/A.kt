package Object

fun main(args: Array<String>) {
    println("Heyy"+A.show())
}
class A {
    companion object {
        fun show():String{
            return("You are learning Kotlin")
        }
    }
}