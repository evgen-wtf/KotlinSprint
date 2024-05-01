package lesson_1

fun main() {
    val totalOfSeconds = 6480
    val seconds = totalOfSeconds % 60
    val minutes = (totalOfSeconds / 60) % 60
    val hours = (totalOfSeconds / 60) / 60

    print("0$hours:$minutes:0$seconds")
}
