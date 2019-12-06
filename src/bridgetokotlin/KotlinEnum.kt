package bridgetokotlin

fun main(args: Array<String>)
{
    val myDay = MyDays.SUN
    when(myDay){
        MyDays.SUN -> println(myDay)
    }
    val today = Days.SAT
    when(today){
        Days.SAT -> println(Days.SAT.value)
    }

    println(MyDays.AUNG)
}

enum class MyDays{
    SUN,MON,TUE,WED,THU,FRI,SAT,AUNG
}

enum class Days(val value:String)
{
    SUN("Sunday"),
    MON("Monday"),
    TUE("Tuesday"),
    WED("Wednesday"),
    THU("Thursday"),
    FRI("Friday"),
    SAT("Saturday")
}