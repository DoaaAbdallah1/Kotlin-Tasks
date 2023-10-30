val link: String="www.oursocialmedia.com"
var like:Int=5
var width:Float=12.6f
var isFollower:Boolean=false
var firstCharacterOfYourName:Char='D'
var isFollowerText:String=isFollower.toString()
var friendCount: String="332"
var firstCondtion=true
var secondCondtion=false

fun main(args: Array<String>) {
    like++
    println(link)
    println(like)
    println(isFollower)
    println(firstCharacterOfYourName)
    println(friendCount.toInt()+6)
    println(firstCondtion||secondCondtion)
    println(133 >= 448)
    println(like.plus(9))
    var userAge=20
    var userInfo="user age = $userAge"
    println(userInfo)


    var firstName:String= readLine()!!.toString()
    var ageThisName:Int= readLine()!!.toInt()
    println("your Name : $firstName")
    println("Age $firstName : $ageThisName")

}