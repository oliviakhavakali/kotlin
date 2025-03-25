import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("enter day(number):")
       var day = read.nextInt()


       var result = when(day) {
           1-> "Monday"
           2 -> "Tuesday"
           3 -> "Wednesday"
           4 -> "Thursday"
           5 -> "friday"
           6 -> "saturday"
           7 -> "sunday"

        else -> "invalid   day of the week"
        }


    println()























}


