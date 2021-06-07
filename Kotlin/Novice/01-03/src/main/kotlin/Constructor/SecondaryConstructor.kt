package Constructor

fun main(args: Array<String>) {
    val Human = Human("My Name", 24)
    print("${Human.message}"+{Human.firstName}+"Welcome to the example of Secondary constructor, Your Age is-${Human.Age}")
}
class Human(val firstName: String, val Age: Int) {
    val  message:String = "Heyy!!"
    constructor(name : String, age: Int, message: String): this(name,age) {

    }
}