package Aquarium

fun main(args:Array<String>)
{
    buildAquarium()
    val fish = Fish(true,20)
    fish.fishExampl()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}" +
    " Width: ${myAquarium.width}" + " height: ${myAquarium.height}")

    myAquarium.width =10

    println("Width: ${myAquarium.width}")

    println("volume : ${myAquarium.volume} liters")

    val mySpice = Spice()
    println("Spice name is ${mySpice.name}  and heat is ${mySpice.heat}")
}
