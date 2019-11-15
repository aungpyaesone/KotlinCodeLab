package Aquarium

class Spices(val name:String, val spiceness:String="mild"){
    init {
      //  val spice = Spices("cayenne", spiceness = "spicy")
        val spic1 = listOf(
            Spices("curry","mild"),
            Spices("pepper","medium"),
            Spices("curry", "mild"),
            Spices("pepper", "medium"),
            Spices("cayenne", "spicy"),
            Spices("ginger", "mild"),
            Spices("red curry", "medium"),
            Spices("green curry", "mild"),
            Spices("hot pepper", "extremely spicy")
        )
        val splist = spic1.filter { it.heat< 5 }
        println(splist)

    }

    private val heat: Int
    get() {
        return when(spiceness)
        {
            "mild"-> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy"  -> 7
            "extremely spicy" -> 10
            else -> 0
        }
    }



    fun makeSalt() = Spices("Sault")


}

fun main(args: Array<String>)
{
val sp = Spices("curry", "mild")
   //println(sp.makeSalt())


}

