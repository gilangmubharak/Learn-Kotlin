class Person (val _name: String, val _age: Int=20) {
    var name : String
    var age : Int

    init {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}
fun main () {
    val person = Person("Gilang", 23)
}