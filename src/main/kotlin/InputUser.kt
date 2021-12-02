import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import kotlin.random.Random.Default.nextInt

fun main() {

    println("What is your name ?")
    val myName = readLine();
    println("What year were you born?")
    val myAge = 2021-Integer.valueOf(readLine())
    println("My name is $myName")
    println("I am $myAge years Old")
    println("==========================================")
    println("Write your Birthday in the following format Year-Month-Day")
    val myBirthDate = readLine();
    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ISO_DATE
    val formatted = current.format(formatter)
    val dateBorn = LocalDate.parse(myBirthDate, DateTimeFormatter.ISO_DATE)

    println("Current Date is: $formatted")
    println("Date Born: $dateBorn")
    if(current.monthValue>=dateBorn.monthValue && current.dayOfMonth>= dateBorn.dayOfMonth){
        val myAge2=current.year-dateBorn.year
        println("$myName you are $myAge2 Years Old")
    }
    else{
        val myAge2=(current.year-dateBorn.year)-1
        println("$myName you are $myAge2 Years Old")
    }
}