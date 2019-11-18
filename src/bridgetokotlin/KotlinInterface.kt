package bridgetokotlin


fun main(args: Array<String>)
{
    val dog = Dog("Aung Net")
    dog.bite()
    dog.eat()
    dog.sleep()
    dog.cute()

    val developer = Developer("ICE")
    developer.sleep()
    developer.eat()
    developer.code()
    developer.repeat()
}
interface AnimalInterface{
    var name: String
    fun eat()
    fun sleep()

}

interface CuteInterface{
    fun cute()
}

interface DogInterface : AnimalInterface{
    fun bite()
}

class Dog(override var name:String): DogInterface,CuteInterface{
    override fun cute() {
        println("So cute")
    }

    override fun bite() {
        println("bite")
    }

    override fun eat() {
        println("eat")
    }

    override fun sleep() {

        println("sleep")
    }
}

interface HumanInterface{
    fun sleep(){
        println("Human Sleep")
    }

    fun eat(){
        println("Human eat")
    }
}

interface CoderInterface{
    fun sleep(){
        println("Coder sleep")
    }
    fun eat(){
        println("Coder eat")
    }
    fun code(){
        println("Code")
    }

    fun repeat(){
        println("Repeat")
    }
}

class Developer(var name:String):HumanInterface,CoderInterface{
    override fun eat() {
        super<CoderInterface>.eat()
        super<HumanInterface>.eat()
        println("DEVELOPER")
    }

    override fun sleep() {
        super<CoderInterface>.sleep()
        super<HumanInterface>.sleep()
        println("DEVELOPER")
    }

    override fun code() {
        super.code()
        println("DEVELOPER")
    }

    override fun repeat() {
        super.repeat()
        println("DEVELOPER")
    }
}
