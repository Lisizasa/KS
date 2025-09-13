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
/*
- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.
“Благоприятные ли условия сейчас для роста бобовых? true/false”

 */