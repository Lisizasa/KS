package lesson2

fun main() {
    val departureHour: Int
    val departureMinute: Int
    val travelTime: Int

    departureHour = 9
    departureMinute = 39
    travelTime = 457

    val arrivalHour: Int = departureHour + travelTime / 60
    val arrivalMinute: Int = (departureMinute + travelTime) % 60

    println("Время прибытия: $arrivalHour:$arrivalMinute")
}
