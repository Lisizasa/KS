package lesson3

fun main() {
    val base: Int = 6
    val rangeLow: Int = 1
    val rangeHigh: Int = 9
    var result: String = ""

    for (i in rangeLow..rangeHigh) {
        result += "$base x $i = ${base * i}\n"
    }
    println(result)
}
