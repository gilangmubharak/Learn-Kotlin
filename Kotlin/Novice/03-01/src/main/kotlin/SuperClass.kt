open class Bases() {
    open val name:String
    init{
        name = "Bases"
    }
    open fun displayName(){
        println("I am in " +  this.name)
    }
}
class Childs(): Bases() {
    override fun displayName(){
        super.displayName()
        println("I am in " + super.name)

    }
}
fun main(args: Array<String>) {
    var a = Childs()
    a.displayName()
}