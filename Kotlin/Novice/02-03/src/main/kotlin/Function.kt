class CAR(var brand: String, var model: String, var year: Int) {
    fun drive() {
        println("Wrooom!")
    }
}
fun main() {

        val c1 = CAR("Ford", "Mustang", 1998)

        println(c1.brand + " " + c1.model + " " + c1.year)
        c1.drive()
    }

