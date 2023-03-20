fun main () {
    val obj = userInfo()
    print(obj)
}

fun userInfo(): Triple<String, String, String> {
    return Triple("Gilang", "Mubharak", "23")
}
