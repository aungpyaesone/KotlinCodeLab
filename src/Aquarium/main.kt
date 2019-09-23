package Aquarium

fun main(args:Array<String>)
{
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}" +
    " Width: ${myAquarium.width}" + " height: ${myAquarium.height}")

    myAquarium.width =10

    println("Width: ${myAquarium.width}")

    println("volume : ${myAquarium.volume} liters")


}
