package bridgetokotlin

fun main(args: Array<String>)
{
   // kotlinList()
    kotlinSet()
    kotlinMap()
}

fun kotlinList(){
    val days  = listOf("Sun","Mon","Tue","Wed","Thu","Fri","Sat")

    days.forEach{
        println(it)
    }
    val anotherDay = mutableListOf("Sun","Mon")
    val endDays = listOf("Wed","Thu","Fri")
    anotherDay.add(2,"Tue")
    println(anotherDay)
    anotherDay.addAll(endDays)
    println(anotherDay)
}



fun kotlinSet(){
    val firstList = listOf(1,1,1,3,5,6)
    val firstSet = setOf(1,1,1,3,5,6)

    println(firstList)
    println(firstSet)
}

fun kotlinMap(){
    val mapValues = hashMapOf("Sun" to 1, "Mon" to 2)
    mapValues.forEach{
        println(it.key)
        println(it.value)
    }

}