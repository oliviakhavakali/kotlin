fun main() {
    //While loop
    var number = 20
    while (number <= 25){

        println("Number: $number")
        number ++

    }

     var num = 5
     while (num >= 1){
        println("number: $num")
         num --
    }

    //Do..While loop
       var x =30
       do {
           println("Number is $x")
           x ++
       }

    while (x <= 35)

    //for loop
    for (a in 100..105){
        println("Number is $a")
    }
 for (letter in 'a'..'d'){
   println("My leter is $letter")
 }
   //Break
    for (b in 70..75){
        if (b == 73){
            break
        }
       println("Number is $b ")

    }

    //continue
    for (character in 'd'..'h'){
        if(character =='f'){
            continue
        }
        println("character is $character")
    }




}

