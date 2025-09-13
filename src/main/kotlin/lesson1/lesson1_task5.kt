package lesson1

fun main() {
    val allSeconds: Short = 6480
    val hours = allSeconds / 3600
    val minutesDivider = 60
    val secondsDivider = 60
    val minutes = allSeconds / minutesDivider % minutesDivider
    val seconds = allSeconds % secondsDivider

    println("$hours:$minutes:$seconds")
}