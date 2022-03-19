fun main() {
    //Percabangan when sebenarnya adalah percabangan switch/case. Percabangan when sama seperti percabangan if/else if/else yang memiliki banyak blok dan kondisi.
    // penggunaan when
    var x:Int = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Perhatikan blok
            println("x is neither 1 nor 2")
        }
    }
    x = 2
    when (x) {

        1,2 -> println("Value of X either 1,2")
        else -> { // Perhatikan blok
            println("x is neither 1 nor 2")
        }
    }
}