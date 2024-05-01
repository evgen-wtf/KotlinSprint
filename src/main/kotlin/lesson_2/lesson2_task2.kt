package lesson_2

fun main() {
    val permanentEmployees = 50
    val trainees = 30

    val permanentEmployeesSalary = 30000
    val traineesSalary = 20000

    val allPermanentEmployeesSalary = permanentEmployees * permanentEmployeesSalary
    val allTraineesSalary = trainees * traineesSalary
    val allEmployeesSalary = allPermanentEmployeesSalary + allTraineesSalary
    val totalNumberOfEmployees = permanentEmployees + trainees
    val averageSalary = allEmployeesSalary / totalNumberOfEmployees

    println(allPermanentEmployeesSalary)
    println(allEmployeesSalary)
    println(averageSalary)

}