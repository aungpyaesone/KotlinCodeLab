package Aquarium

class InitOrderDemo(string: String){
    val firstProperty = "First property: $string".also(::println)
    init {
        println("First initializer block that prints ${string}")
    }

    val secondProperty = "Second property: ${string.length}".also(::println)
    init {
        println("Second initializer block that prints ${string.length}")
    }
}

fun main(args:Array<String>)
{
    val initOrder = InitOrderDemo("Hello")
}