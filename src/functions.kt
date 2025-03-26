fun main() {
    //standard-library Functions/Predefined Functions
    var output =Math.sqrt(144.0)
    println("The squareroot of 144 is $output")

    var number = Math.round(45.89)
    println(number)

   school()
    add()
    student("John","Male",43)
    student("Ann","Female",23)
    employee("James",450000,false)
}
   //user-defined functions
   fun school (){
       println("eMobilis")

   }
fun add(){
    var x = 3
    var y = 5
    println(x + y)
}
 // parameters/variables and Arguments/value
 fun student(name:String,gender :String,age :Int){
     println("$name 1s a $gender .$name is $age years old")
 }

fun employee(name:String,salary:Int,disability:Boolean){

    println("$name the salary.$name has disability $disability")
}
