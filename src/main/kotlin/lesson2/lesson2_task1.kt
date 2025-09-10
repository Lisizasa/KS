package lesson2

fun main() {
    val allMarks: IntArray = intArrayOf(3, 4, 3, 5)
    val average: Double = allMarks.sum().toDouble() / 4
    println("%.2f".format(average))
}
