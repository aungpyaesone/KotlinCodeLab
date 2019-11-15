package Aquarium

open class Book( val title: String,val author: String){

     private var currentPage: Int = 1;

     open fun readPage(){
        currentPage++
     }
 }
class eBook(title:String,author: String,var format:String = "text"): Book(title,author) {
    private var wordRead = 0;
    override fun readPage(){
        wordRead = wordRead + 250;
    }
}

fun main(args:Array<String>)
{
    val eBook = eBook("title","author")
}