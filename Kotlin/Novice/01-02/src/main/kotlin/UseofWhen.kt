fun main(args: Array<String>) {
    val x: Int = 5
    when (x) {
        1 -> print("x = = 1")
        2 -> print("x = = 2")

        else -> {// note the block
            print("x is neither 1 no 2")
            // }
        }
    }
}