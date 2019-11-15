package bridgetokotlin



fun main(args: Array<String>)
{
    val second = SecondClass("Mg Ice","Hladen")
    second.testCall()
}
open class FirstClass(val name:String)
{
    open fun testCall(){
        println("Test call from first")
    }
}

class SecondClass(name:String,var address:String):FirstClass(name)
{
    override fun testCall() {
        super.testCall()
        println("Test call from second class")
    }
}