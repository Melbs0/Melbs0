import kotlin.random.Random
fun sorteio(){


    val opção1 = "Example1"

    val opção2 = "Example2"



    var x1 = false
    fun IntRange.random() = (Math.random() * ((endInclusive + 1) - start) + start).toInt()
    val range = (1..2).random()


    if (range == 1) {
        x1 = true
    } else {
        x1 = false
    }

    range
    x1

    when (x1) {
        true -> println(opção1)
        else -> {
            println(opção2)
        }


    }
}
sorteio()
