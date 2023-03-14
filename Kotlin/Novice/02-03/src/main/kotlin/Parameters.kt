
class Mobil(var brand: String, var model: String, var year: Int) {

    fun drive() {
        println("Wrooom!")
    }

    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}
        fun main() {
            val c1 = Mobil("Ford", "Mustang", 1998)

            println(c1.brand + " " + c1.model + " " + c1.year)
            c1.drive()
            c1.speed(200)
        }


