package kotlinlambda

data class Person(val name:String, val age: Int)
fun main(args: Array<String>)
{
    val people = listOf(
        Person("Jack",11),
        Person("Shelly",15),
        Person("Patrick",20),
        Person("Jill",25),
        Person("Shane", 55),
        Person("Joe",30)
    )

    val selectedPerson = people.maxBy({person ->  person.age })
    val selectPerson = people.maxBy({it.age})

    val myselectedPerson  = people.filter { it.name.startsWith("S") }.maxBy { it.age }

    println(myselectedPerson)
  //  println(selectPerson)
  //  println("name: ${selectPerson?.name}")
   // println("age : ${selectPerson?.age}")
}