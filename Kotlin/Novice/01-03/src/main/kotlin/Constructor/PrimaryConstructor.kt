package Constructor

fun main(args : Array<String>) {
    val person1 = Person("My Name", 15)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}
class Person(val firstName: String, var age: Int) {

}