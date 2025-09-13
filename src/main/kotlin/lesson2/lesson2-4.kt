package lesson2

fun main() {
    val crystals: Int = 7
    val iron: Int = 11
    val percent: Double = 0.2

    println("Кристаллическая руда: ${(crystals * percent).toInt()}")
    println("Железная руда: ${(iron * percent).toInt()}")
}
