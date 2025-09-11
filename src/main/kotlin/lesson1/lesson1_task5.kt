package lesson1

fun main() {
    val allSeconds: Short = 6480
    val hours = allSeconds / 3600
    val minutes = allSeconds/60 % 60
    val seconds = allSeconds % 60

    println("$hours:$minutes:$seconds")
}