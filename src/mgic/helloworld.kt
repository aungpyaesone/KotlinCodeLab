package mgic

import java.util.*

fun main(args:Array<String>)
{
    dayOfWeek()
    println("Hello ${args[0]}")

    val a = println("This is an expression")
    println(a)
}

fun dayOfWeek(){
    println("Which day is today?")
 val day =  Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
  println( when (day) {
      1 -> "Sunday"
      2 -> "Mon"
      3 -> "Tue"
      4 -> "Wed"
      5 -> "Thu"
      6 -> "Fri"
      7 -> "Sat"
      else -> "Time has stopped" }
  )

}