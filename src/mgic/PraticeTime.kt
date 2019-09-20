package mgic

fun main(args:Array<String>)
{
    var fortune: String
   /* for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }*/
    var n = 10;
    while (n>1)
    {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy"))
            break
        n--
    }


}

fun getFortuneCookie():String {
    val fortune = listOf(
        "You will have a great day!", "Things will go well for you today", "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.", "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune."
    );

    print("Enter Your Birthday")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortune[birthday.rem(fortune.size)]

    // rem()  for finding the remainder
    // toIntOrNull() for check null and parse string to int

}