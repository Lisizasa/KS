package lesson1

import java.text.DecimalFormat

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7


    println("year = $year")
    println("hour = ${DecimalFormat("00").format(hour)}")
    println("minute = ${DecimalFormat("00").format(minute)}")

    hour = 10
    minute = 55
    println("$hour:$minute")
}
