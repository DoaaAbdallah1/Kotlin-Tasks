//var friendsCount=239

fun IntProgression.printAll(){
    this.forEach{
        print(" $it ")
    }
}
fun main() {

    val myRange='a'..'z' step(3)
   // myRange.printAll()
    println()
    val someChar=readLine()!!.toCharArray()[0]
    if(someChar in myRange){
        print("in range")
    }else{
        print("not in range")
    }
//    val myRange=0..100 step(5)
//    myRange.printAll()
//    println()
//    val someNumber=readLine()!!.toInt()
//    if(someNumber in myRange){
//        print("in range")
//    }else{
//        print("not in range")
//    }

//
//    if(friendsCount in 0..20){
//        print("Lonely")
//    }else if(friendsCount in 20..100){
//        print("family & friends")
//    }else if(friendsCount in 100..500){
//        print("Social person")
//    }else if(friendsCount in 500..5000){
//        print("famous")
//    }

}