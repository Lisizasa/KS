package lesson1

fun main() {
    val seconds: Short = 6480

    println("${seconds/3600}:${seconds/60 % 60}:${seconds % 60}")
}