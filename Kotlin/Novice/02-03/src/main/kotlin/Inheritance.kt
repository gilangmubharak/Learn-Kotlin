open class MyParentClass {
    val X = 5
}

class MyChildClass: MyParentClass() {
    fun myFunction() {
    println(X)
    }
}
    fun main() {
    val myObj = MyChildClass()
        myObj.myFunction()
}