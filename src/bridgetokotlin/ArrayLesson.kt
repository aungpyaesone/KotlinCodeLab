package bridgetokotlin

val days = arrayOf("Sun","Mon","Tue","Wed","Thu","Fri","Sat")

val anotherDays = arrayOf("Sun","Mon","Tue","Wed","Thu","Fri","Sat")

fun main(args:Array<String>)
{
    // how to make arrayOperation
    arrayOperation()

    arrayExtension()

    arrayAll()


}

fun arrayExtension(){
    val number = arrayOf(2,4,6,8,10)
    val isEven: (Int) -> Boolean = {it%2 == 0}
    val iterator = number.iterator()

/*    while (iterator.hasNext())
    {
        if(isEven(iterator.next()))
        {
            println("true");
        }
    }*/

    println(number.all(isEven))
}

fun arrayAll(){
    val numbers = arrayOf(1,4,5,7,9)
    val isEven:(Int) -> Boolean = {it %2 == 0}

    println(numbers.all(isEven))
    println(numbers.any(isEven))
}

fun arrayOperation(){
    for(day in days){
        println(day)
    }
    if(days.contentEquals(days))
    {
        println("They are equal")
    }
    else{
        println("They are not equal")
    }

    if (days.contentEquals(anotherDays))
    {
        println("They are equal")
    }
    else {
        println("they are not equal")
    }
}
