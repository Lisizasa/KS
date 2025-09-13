package lesson2

import kotlin.math.pow

fun main() {
    val initialSum: Int = 70_000
    val percent: Double = 16.7
    val years: Int = 20

    val deposit = "%.3f".format(initialSum * (1 + percent / 100).pow(years))
    println(deposit)
}
