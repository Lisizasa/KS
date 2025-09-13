package lesson2

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTime: Int = 457
    val hoursDivider = 60
    val minutesDivider = 60

    val arrivalHour: Int = departureHour + travelTime / hoursDivider
    val arrivalMinute: Int = (departureMinute + travelTime) % minutesDivider

    println("Время прибытия: $arrivalHour:$arrivalMinute")
}
