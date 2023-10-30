fun main() {
    val myFriend=listOf("Ail","Ahmed","Ameer","Doaa","Abeer")
  //  var numberOne:Int= readln().toInt()
  //  var numberTwo:Int= readln().toInt()
  //  println(summation(numberOne,numberTwo))
 //   println(power(3,3))
    println( getFriendsDetails(myFriend))
    print(getFriendsNameStartWith(myFriend,'A'))
    println(myFunction(2,8))
}
fun summation(num1:Int,num2:Int):Int{
    return num1+num2;
}
fun getFriendsNameStartWith(listOfFriends:List<String>,firstCharacter:Char)= listOfFriends.filter { it.get(0)==firstCharacter }
val myFunction={no1:Int,no2:Int->
    no1+no2
}
fun power(pow:Int=3,number:Int):Int{
    var result:Int=1
    for(i in 1.. pow){
        result*=number
    }
 return result
}
fun getFriendsDetails(friends:List<String>):String{
    return "You have ${friends.size} Friends"
}