fun main() {
    for(i in 0..20){
        if (i==3){
            break
        }
    }
    for (i in 0..6){
        for(j in 0..20){
            print(" ${i*j} ")
            if (j==6) {
                break
            }
        }
        println()
    }
}