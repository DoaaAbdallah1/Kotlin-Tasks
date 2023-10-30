
fun main() {
    var friendsCount=389

    when (friendsCount) {
        in 0..20 -> {
            print("Lonely")
        }
        in 20..100 -> {
            print("family & friends")
        }
        in 100..500 -> {
            print("Social person")
        }
        in 500..5000 -> {
            print("famous")
        }
    }
    println()
    val myNumber=5
    val digitCounts=when(myNumber){
        !in 20..40->"Some Number"
        in 1..9 -> "One"
        in 10..99-> "Two"
        else -> "Long Number"
    }
    print(digitCounts)
}