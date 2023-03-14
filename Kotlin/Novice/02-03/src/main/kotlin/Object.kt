fun main () {
    val c1 = Car()

    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1997
    c1.brand = "Ferrari"
    c1.model = "Superfast"
    c1.year = 1999

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}