package mgic

import java.util.*


fun main(args:Array<String>)
{
    println(args[0].toInt())
    if(args[0].toInt()<12)println("Good Morning") else println("Good Night ! Kotlin")


    feedDay()

}

fun feedDay(){
    val day = randomDay();
    val fish = "shark"
    println("Today is $day and I eat $fish")
}

fun randomDay():String{
    val weekday = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return weekday[Random().nextInt(7)]
}