package bridgetokotlin

fun main(args:Array<String>)
{
    val x = 45
    if(x.isEven()) println("$x is even") else println("$x is odd")
    val days = arrayOf("Sun","Mon","Tue","Wed","Thu","Fri","Sat")
    val number = arrayOf(1,2,3,4,5,6,7,8,9)
    println(days.combineAll())
    println(number.combineAll())
    val y = 44
    if (y.isEven()) println("$y is even") else println("$y is odd")
    val s = "Mg"
    if(s.isIce())println("It is true")else println("It is false")
}

private fun <T> Array<T>.combineAll(): Any{
    val sb = StringBuilder()
    this.forEach {
        sb.append(it)
    }
    return sb.toString()
}

private fun Int.isEven():Boolean{
    if(this %2 == 0) return true
    return false
}

private fun String.isIce():Boolean{
    if(this.equals("Ice"))return true
    return false
}