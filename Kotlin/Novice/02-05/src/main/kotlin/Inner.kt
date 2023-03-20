fun main () {
   val obj = Inner().Outer()

    print(obj.foo())
}

class Inner {
    private val welcomeMessage: String = "Gilang Mubharak"

    inner class Outer {
        fun foo() = welcomeMessage
    }
}
