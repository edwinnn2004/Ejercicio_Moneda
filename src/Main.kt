import kotlin.random.Random

fun main() {
    var moneda :Int
    var cara = 0
    var sello = 0

    for(i in 1..20) {
        moneda = Random.nextInt(1, 3)
        if (moneda == 1) {
            println("Cara")
            cara++
        } else if (moneda == 2) {
            println("Sello")
            sello++
        }
    }
    println("La cantidad de sellos son: $sello")
    println("La cantidad de caras son: $cara")
}


