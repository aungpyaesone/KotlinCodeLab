package bridgetokotlin

class PrimaryClass(val firstName:String)
{
    val secondVal: String = "Hello from Kotlin ";

    init {
        first()
        println("Second Val $secondVal")
    }

    val thirdVal: String = "Hello from kotlin again"
    init {
        second()
        println("Third Val $thirdVal")
    }

    fun first(){
        println("Hello from first")
    }

    fun second(){
        println("Hello from second")
    }

}

class Calculator(val firstValue: Int){
    var sum: Int = 0;
    init {
        sum += firstValue;
    }
    val secondValue = 400;
    init {
        sum += secondValue;
    }
    val thirdValue = 600
    init {
        sum += thirdValue
        println(sum)
    }

    constructor(firstValue: Int,secondValue:Int):this(firstValue)
    {
        sum += secondValue
        println(sum)
    }
}
fun main(args: Array<String>)
{
  //  val primaryClass = PrimaryClass("John")

   val calculator = Calculator(300)
    val anotherCal = Calculator(500,50)
}