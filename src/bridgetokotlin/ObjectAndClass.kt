package bridgetokotlin

fun main(args: Array<String>)
{

    // calling primary constructor
    val primary = Primary("Mg Ice")
    val primaryCon = PrimaryConstructor("Aung Pyae Sone")
    primary.testCall()
    primaryCon.testCall()


    // calling secondary constructor
    val myTest = MyTest("Aung Aung")
    val anotherMyTest = MyTest("Aung","Pyae")
    myTest.testAnotherCall()
    anotherMyTest.testAnotherCall()

    // calling inheritance class

    val second = Second("Aung Pyae","RC2 Inlay Hostel")
    println(second.name)
    println(second.myName)



}


// ----------- primary constructor writing style ---------------- //
class Primary constructor(val firstName: String){
    fun testCall(){
        println("First name : $firstName")
    }
}

class PrimaryConstructor(val firstName: String)
{
    fun testCall(){
        println("first name : $firstName")
    }
}

// -------------- end primary constructor writing style ------------------- //

// --------------- secondary constructor writing style ------------------- //
class MyTest(val firstName: String)
{
    var lastName: String? = null
    constructor(firstName: String, lastName:String) : this(firstName){
        this.lastName = lastName;
    }
    fun testCall(){
        println("First name: $firstName")
    }

    fun testAnotherCall(){
        println("Name : $firstName $lastName")
    }
}

// --------------- end secondary constructor writing style ----------------- //

open class First(val name:String)

class Second(name: String,val myName:String):First(name)