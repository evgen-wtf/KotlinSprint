package lesson_1

fun main() {
    val year = 1961

//    var hour = 09 // не понимаю,почему int не работает с нулем в начале?
//    var minute = 07

    var hour: String = 9.toString()
    var minute: String = 7.toString()

    println(year)
    println(hour)
    println(minute)

//    hour = 10 // также не понял, почему нельзя повторно иницилизировать переменную int без приведения к строке?
//    minute = 55

    hour = 10.toString()
    minute = 55.toString()
    print("$hour:$minute")
}