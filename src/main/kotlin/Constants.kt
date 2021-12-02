const val PI_VALUE = 3.14
fun main(){
    val str ="Alda"
    println(str.get(0).plus(str.get(str.length-1).toString()));
    var newSTr = str.slice(1..str.length-2);
    println(newSTr)
}