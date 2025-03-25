import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter your firstnumber:")
    var firstnumber = readln()


    println("enter your secondnumber: ")
    var number = readln()


    println("enter your thirdnumber: ")
    var thirdnumber = readln()

   if (firstnumber>=number && firstnumber>=thirdnumber){

       println("$firstnumber is largest number")

   }
   
   else {
       if (number<=firstnumber && number >= thirdnumber){
           println("$number is the largest number")
       } else {
           println("$thirdnumber is largest number")

       }
   }



}