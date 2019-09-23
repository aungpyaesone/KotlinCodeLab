package kotlinlambda

fun main(args: Array<String>)
{
    val product = {a:Int, b:Int -> a * b}
    println(product(10,4))

    val greeting = {println("Hello")}
    greeting()
    callMe({ println("hello") })

}

fun  callMe(greeting: () -> Unit){
    greeting()
}