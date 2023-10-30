val isUserBlocked=false
val followerCount=4600000
fun main() {
    if (followerCount<1000){
        print(followerCount)
    }else if (followerCount<1000000){
        print("${followerCount/1000}K")
    }else{
        print("${followerCount/1000000}M")
    }


    val numberOne=300
    val numberTwo=370
    var max=if(numberOne>numberTwo) numberOne else numberTwo
    println()
    print(max)


}