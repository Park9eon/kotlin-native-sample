import kotlinx.cinterop.*
import stdio.*

fun main(args: Array<String>) {

    println(hello_message()?.toKString())

    srand(time(null).toInt())
    (0..2).forEach {
        println("Random value ${rand()}")
    }

}