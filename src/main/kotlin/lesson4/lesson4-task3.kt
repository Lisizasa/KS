package lesson4

fun main() {
    val isSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val wetness: Int = 20
    val season: String = "зима"

    val goodWetness = 20
    val badSeason = "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && tentIsOpen && wetness == goodWetness
            && season != badSeason}")
}
