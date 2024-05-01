package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    val buffCrystalOre = (crystalOre * 20) / 100
    val buffIronOre = (ironOre * 20) / 100


    println("Бафф 20% на кристаллическую руду - $buffCrystalOre")
    println("Бафф 20% на железную руду - $buffIronOre")
}