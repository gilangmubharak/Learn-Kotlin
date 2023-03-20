class person{
    val _name: String
    val _age: Int

    constructor(_name: String, _age: Int = 20) {
        this._name = _name
        this._age = _age
        println("Initializer Block")
    }

    var name: String = ""
    var age: Int = 0

}

fun main () {
    val Gilang = Person("Gilang, 23")
}