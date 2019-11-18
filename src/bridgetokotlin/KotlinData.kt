package bridgetokotlin

data class KotlinStudent(val id:Int,val name:String, val address:String)

fun main(args: Array<String>)
{
    val kotlinStudent = KotlinStudent(1,"Aung Aung","Hledan")
    val kotlinNewStudent = kotlinStudent.copy(address = "Hlaing")
    println(kotlinNewStudent)
    println(kotlinStudent)
}
