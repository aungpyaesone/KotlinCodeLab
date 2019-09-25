package Aquarium

class Fish(val friendly:Boolean = true, volumeNeeded: Int)
{
    val size: Int



    constructor(): this(true,20){
        println("running secondary constructor")
    }

    init {
        println("first init block")
    }
    init {
        if(friendly)
        {
            size = volumeNeeded
        }
        else{
            size = volumeNeeded * 2
        }
        println("second init block")
    }
    init {
        println("last init block")
    }

    init {
        println("constructed init size $volumeNeeded final size ${this.size}")
    }


    fun fishExampl() {
        val fish = Fish(true,20)
        println("Is the fish friendly ? ${fish.friendly}. It need volume ${fish.size}")
    }
}
fun main (args:Array<String>)
{

   val fishone = Fish(true,20)
  //  val fish = Fish()
}

// init block run once when constructor calling