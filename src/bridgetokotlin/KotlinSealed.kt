package bridgetokotlin

sealed class Mammal(val name:String)
class Cat(val catName:String):Mammal(catName)

class Human(val humanName:String,val job:String): Mammal(humanName)

fun greetMammal(mammal: Mammal):String{
    when(mammal){
        is Human -> return "Hello ${mammal.name}: You are working as a {${mammal.job}}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main(args:Array<String>)
{
    val mammal: Mammal = Human("John Doe","CEO")
    println(greetMammal(mammal))

    val cat:Cat = Cat("Shwe War")
    println(greetMammal(cat))

    //
    val bScreenState = BasicScreenState.DATA
    bridgetokotlin.basicScreenState(bScreenState)
}


enum class BasicScreenState{
    ERROR,
    LOADING,
    DATA
}

fun basicScreenState(basicScreenState: BasicScreenState){
    when(basicScreenState){
        BasicScreenState.ERROR -> println("Error")
        BasicScreenState.LOADING -> println("Loading")
        BasicScreenState.DATA -> println("Data")
    }
}


data class SomeData(val id:Int,val name:String)

enum class ScreenStateField(val someData: SomeData){
    ERROR(SomeData(1,"some data one")),
    LOADING(SomeData(2,"some data two")),
    DATA(SomeData(3,"some data three"))
}