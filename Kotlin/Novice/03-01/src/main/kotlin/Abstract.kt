abstract  class person (_name: String) {
    var name: String
    abstract var age: Int

    init {
        this.name = _name
    }
    abstract fun setPersonAge(_age:Int)
    abstract fun getPersonAge():Int

    fun getPersonName() {
        println("Name = $name")
    }
}
class Employee(_name: String): person(_name) {
    override var age: Int = 0

    override fun setPersonAge(_age: Int) {
        age = _age
    }
    override fun getPersonAge():Int {
        return age
    }
}
fun main () {
    val employee = Employee("Gilang")
    var age : Int

    employee.setPersonAge(24)
    age = employee.getPersonAge()
    employee.getPersonName()
    println("Age = $age")
}
