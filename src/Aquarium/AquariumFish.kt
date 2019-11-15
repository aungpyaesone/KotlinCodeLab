package Aquarium

abstract class AquariumFish{
    abstract val color: String
}

class Shark: AquariumFish() {
    override val color =  "blue"

}

class Plecostomus: AquariumFish(){
    override val color = "green"
}

fun main(args:Array<String>){
    val shark = Shark()
    val p = Plecostomus()
    println(shark.color)
    println(p.color)
}