package lesson1

fun main() {
    val allSeconds: Short = 6480
    val hours = allSeconds / MINUTES_IN_HOUR / SECONDS_IN_MINUTE

    val minutes = allSeconds / MINUTES_IN_HOUR % MINUTES_IN_HOUR
    val seconds = allSeconds % SECONDS_IN_MINUTE

    println("$hours:$minutes:$seconds")
}
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60