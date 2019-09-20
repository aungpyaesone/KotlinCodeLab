package mgic

fun main(args:Array<String>){

     /*println(canAddFish(10.0, listOf(2,3)))
     println(canAddFish(20.0, listOf(5,5), hasDecorations = false))

     println("ONE  "+whatShouldIDoToday("sad"))
    println("TWO  "+whatShouldIDoToday("happy","sunny"))
    println("THREE  "+whatShouldIDoToday("sad","rainy",0))

    println(isVeryHot(2))
    println(isHappySunny("happy","sunny"))
    println(isSadRainyCold("sad","rainy",50))*/
   // println(whatShouldIDoToday(readLine()!!))

    egarFun()

    praticeFilter()


}

// single expression function
fun isVeryHot(temperature: Int) = temperature > 35
fun isSadRainyCold(mood: String,weather: String,temperature: Int) = mood=="sad" && weather =="rainy" && temperature ==0
fun isHappySunny (mood: String,weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday(mood:String,weather:String="sunny",temperature:Int = 24):String {
   return when
    {
      isHappySunny(mood,weather) -> "go for a walk"
      isSadRainyCold(mood,weather,temperature)->"Stay in Bad"
      isVeryHot(temperature) -> "go swimming"
        else -> "Stay home and read"
    }
}///

// ------------------- Kotlin Filter ----------------- //
fun egarFun(){
    val decoration = listOf<String>("rock","pagoda","plastic plant","alligator","flowerpot")
    val eager = decoration.filter { it[0]== 'p' }
    println(eager)

    // apply filter lazily
    val filtered = decoration.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())

    // apply map lazily
    val lazyMap = decoration.asSequence().map {
        println("map: $it")
        it
    }
    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
}

fun praticeFilter(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    var filtered = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(filtered)
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }) // startwith 'c' and endwith 'e' filter
    //spices.filter { {it.startsWith('c') && it.endsWith('e') } another way

    //Filtering the first 3 items by 'c'
    println(spices.take(3).filter{it.endsWith('y')})
}





// logic //
// tank with decoration can contain a total length of fish <= 80 % of tanksize
// tank without decoration can contain a total length of fish up to 100% of the tanksize

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int =4, hasDecorations: Boolean = true): Boolean {

    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

// call function into function
fun shoudChangeWater(day:String,temperature:Int = 22,dirty:Int = 20):Boolean{
    fun isHot(temperature: Int) = temperature>30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"
    return when
    {
        isHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true

        else -> false
    }
}