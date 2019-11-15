package Aquarium

class InitOrderDemo(string: String){
    val firstProperty = "First property: $string".also(::println)
    init {
        println("First initializer block that prints ${string}")
    }

    val secondProperty = "Second property: ${string.length}".also(::println)
    init {
        println("Second initializer block that prints ${string.length}")
    }
}

fun main(args:Array<String>)
{
    val initOrder = InitOrderDemo("Hello")
}

open class Shape{
    open fun draw()
    {
        fun fill(){}
    }

}

class Circle() : Shape(){
    override fun draw() {
        super.draw()
    }
}

/// // Secondary Constructor
class  Person{
    var children: MutableList<Person> = mutableListOf();
    constructor(parent:Person){
        parent.children.add(this); //delegate to primary constructor
    }
}

class MyClass(val name:String){
    val children: MutableList<MyClass> = mutableListOf();
    constructor(name:String,parent:MyClass) : this(name) {
        parent.children.add(this);
    }
}
