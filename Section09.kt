fun main() {
    for(i in 0..12){
      print(" $i ")
    }
    println()
    for(i in 40.downTo(0) step(5)){
        print(" $i ")
    }
    println()
    val myFamilyList= listOf("Doaa","abeer","Mohemmed","yousef")
    for (element in myFamilyList){
        print("  $element  ")
    }
    println()
    myFamilyList.forEach{
        print(" $it ")
    }
}