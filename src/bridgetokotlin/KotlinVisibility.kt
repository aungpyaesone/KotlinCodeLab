package bridgetokotlin

private val API_LINK = "http://something.org/test"
val PROJECT_NAME = "Test Kotlin"
internal  val yummy = "Yummy"

fun main(args: Array<String>){
    val animal = Animal("Puppy")
    println(API_LINK)
    animal.accessPublic()
    val test = Testing()
    test.accessPrivate()
}

class Testing(){
    fun accessPrivate(){
        println(API_LINK)
    }
}
