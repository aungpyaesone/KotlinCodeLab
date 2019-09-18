package mgic

fun main(args:Array<String>)
{
    println(args[0].toInt())
    if(args[0].toInt()<12)println("Good Morning") else println("Good Night ! Kotlin")
}