package lesson_2

fun main() {
    val departureTime = 579
    val travelTime = 457

    val arrivalTimeMinutes = (departureTime + travelTime) % 60
    val arrivalTimeHours = (departureTime + travelTime) / 60


    println("$arrivalTimeHours:$arrivalTimeMinutes")
}