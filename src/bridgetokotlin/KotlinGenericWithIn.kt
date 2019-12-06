package bridgetokotlin
fun main(args: Array<String>) {
    val animalCompare: Compare<Animals> = object : Compare<Animals> {
        override fun compare(first: Animals, second: Animals): Boolean {
            return first.name == second.name
        }
    }


    val ohDog = Dogs("Aung Net","Puppy")
    val ohCat = Cats("Aung Net","Gold")
    val dogCompare: Compare<Dogs> = animalCompare
    val catCompare: Compare<Cats> = animalCompare


    println(dogCompare.compare(ohDog,ohDog))
    println(catCompare.compare(ohCat,ohCat))

}
interface Compare<in T> {
    fun compare(first: T, second: T): Boolean
}
abstract class Animals(val name: String)
class Dogs(name: String, val breed: String) : Animals(name)
class Cats(name: String, val color: String) : Animals(name)


