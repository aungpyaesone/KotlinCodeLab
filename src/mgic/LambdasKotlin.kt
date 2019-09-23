package mgic

import java.lang.Math.random
import java.util.*

fun main(args:Array<String>)
{
    dirtyProcessor()
    val random1 = random()
    val random2 = {random()}

    println(random1)
    println(random2)

    gamePlay(rollDiceFour(4))


}

var dirty = 20;
val waterFilter: (Int)-> Int = { dirty -> dirty/2}
fun feedfish(dirty:Int)  = dirty + 10

fun updateDirty(dirty: Int,operation: (Int)->Int): Int{
    return operation(dirty)
}

fun dirtyProcessor(){
    dirty = updateDirty(dirty, waterFilter) // pass waterFilter variable
    dirty = updateDirty(dirty, ::feedfish) // pass feedfish function with ::
    dirty = updateDirty(dirty,{dirty -> dirty + 50}) // pass lambda function direct
    println(dirty)
}


var diceRollOne = { Random().nextInt(12)+1}

val rollDiceTwo = {sides: Int ->Random().nextInt(sides)+1}

val rollDiceThree = {sides: Int -> if(sides == 0) 0
                                    else Random().nextInt(12)+1
}

val rollDiceFour : (Int) -> Int ={
    sides -> if(sides == 0) 0
    else
    Random().nextInt(12) + 1

}


fun gamePlay(diceRoll: Int){
        println(diceRoll)
}




