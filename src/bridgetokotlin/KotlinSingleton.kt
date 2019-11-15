package bridgetokotlin

val API_END = "http://something.com/api/v1/testcall"

fun main(args: Array<String>)
{

    // --=------ TEST SINGLETON OBJECT ------------//
/*    println(Single.name)
    println(Single.nameChange)
    Single.nameChange = "Hello from mg ice"
    println(Single.nameChange)

    callApi()
    println(API_END)*/
   // ----------------- END TEST SINGLETON OBJECT ----------------- //

    // -------------------- Companion Object ------------------- //
    val instance = SingleOne.create("PyaeSone")
    instance.next()
    instance.next().nextNext()
    //--------------------- End Companion Object ---------------------- //


    /// ------------------ Object Declaration -------------------//
    UseFactory.post("Howdy")
    UseFactory.post("Hello Wind")
    UseFactory.post("Hello Pyae Sone")

    UseFactory.give("It is Ok")
    UseFactory.give("It is Fine")
    UseFactory.give("It is good")

    //-------------- End Object Declaration --------------------- //
    // Object Expression --------------//
    val objExp = object {
        val max = 4500
        val min = 3500
        fun dosomething(){
            println("max is $max")
            println("min is $min")
        }
    }
    objExp.dosomething()
}

object Single{
    val name: String = "Hello From Kotlin"
    var nameChange: String = "Hello from our world"

    init {
        println("Hello form init")
    }

    var test = "Hello Again"
    init {
        println(test)
    }
}

fun callApi(){
    println("Api End Point : $API_END")
}

class SingleOne private constructor(val message:String){
    init {
        println("Constructor run $message")
    }
    companion object{
        fun create(message:String):SingleOne = SingleOne(message)
    }

    fun next(): SingleOne{
        println(message)
        println("-------")
        return this
    }

    fun nextNext(){
        println("NEXT NEXT")
    }
}

class Factory private constructor(val message:String){
    init {
        println("Factory inited ! $message")
    }
    companion object{
        fun create(message:String): Factory = Factory(message)
    }

    fun post(another:String)
    {
        println(another)
    }

    fun give(another:String){

        println(another)
    }
}
object UseFactory{
    val factory = Factory.create("Hello Kotlin")
    fun post(another: String) = factory.post(another)
    fun give(another: String) = factory.give(another)
}
