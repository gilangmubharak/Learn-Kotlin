fun main () {
    val day = 6

    val result = when (day) {
        1 -> "monday"
        2 -> "tuesday"
        3 -> "wednesday"
        4 -> "thursday"
        5 -> "friday"
        6 -> "saturday"
        7 -> "sunday"
        else -> "invalid day."
    }
    println(result)
}