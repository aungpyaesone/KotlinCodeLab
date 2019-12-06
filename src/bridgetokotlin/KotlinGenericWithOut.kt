package bridgetokotlin

interface List<out E>{
    fun get(index: Int):E
}

fun main(args: Array<String>)
{
    val days = listOf("Sun","Mon","Tue","Wed","Thu","Fri","Sat")
    val getList: List<String> = object : List<String>{
        override fun get(index: Int): String {
            return days[index]
        }
    }
    println(getList.get(4))
    println(getList.get(5))
}