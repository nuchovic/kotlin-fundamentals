fun main (){
    val myMessage = "Happy Birthday! Justin!"
    val firstName = "Joaquim Marques da"
    val surName = "Costa"
    val nickName ="nuchovic"
    val product =100
    val amount = 10

    println(myMessage.substring(16,22).plus(" =^_^="))
    println(myMessage.contains("Birthday"))
    println("$firstName $surName")
    println(myMessage.split("!")[0].plus(" $firstName $surName"))
    println(myMessage.drop(16).split("!")[0].plus(" $surName"))
    println("Hey ${nickName.substring(0,1).uppercase().plus(nickName.substring(1, nickName.length))} you need to pay me ${product*amount} for your order")

}