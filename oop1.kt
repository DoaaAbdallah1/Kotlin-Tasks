import model.Post

fun main() {
    val myPost=Post()
    println(myPost.countLike)
    myPost.like()
    myPost.like()
    println(myPost.countLike)
}