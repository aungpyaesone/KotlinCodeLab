package bridgetokotlin

fun main(args: Array<String>)
{
 //  kotlinIf()
 //   val test = Test()
   // test.test()
    kotlinForLoop()
}

fun kotlinIf(){
    val numOne = 45
    val numTwo = 34

    val max = if(numOne > numTwo) numOne else numTwo
    println(max)

    val anotherMax = if(numOne > numTwo)
    {
        print("A is max")
        numOne
    }
    else {
        print("B is Max")
        numTwo
    }
    println(anotherMax)
}

// kotlin When -------------------------------------------- when when when
class  Test{
    fun test(){
        val x = 1
        when (x){
            1 -> println("One")
            2 -> println("Two")
            else -> {
                println("others")
            }
        }

        val y = 4
        when(y)
        {
            in 1..5 -> println("It is in the range of 1 to 5")
            !in 7..9 -> println("It is not in the range of 7 to 9")
            6 -> println("six")
            else ->
            {
                println("other")
            }
        }

        when{
            x.isOdd() -> println("X is odd")
            x.isEven() -> println("X is even")
        }
    }
}


private fun Int.isOdd(): Boolean{
    if(this % 2 != 0) {
        return true;
    }
    return false
}

private fun Int.isEven(): Boolean{
    if(this % 2 == 0)
    {
        return  true
    }
    return false
}

fun kotlinForLoop(){
    val myLists =  listOf("Sun","Mon","Tue","Wed","Thu","Fri")
    val myArray = arrayOf("Aung Aung","Manung Maung","Kaung Kaung","Hlaung Hlaung")

    for(myList in myLists)
    {
        println(myList)
    }
    for(i in myArray.indices)
    {
        println(myArray[i])
    }
}