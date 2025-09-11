package lesson2

fun main() {
    val numberOfStudents: Int = 4
    val allMarks: IntArray = intArrayOf(3, 4, 3, 5)
    val average: Double = allMarks.sum().toDouble() / numberOfStudents
    println("%.2f".format(average))
}
