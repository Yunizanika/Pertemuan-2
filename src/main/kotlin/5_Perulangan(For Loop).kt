fun main() {
    //The for loop
    /*
    Pernyataan yang terdapat pada while loop akan di eksekusi berulang-ulang selama kondisi pada statement while bernilai true.
     */
    for (i in 1..10) {
        print("$i ")
    }
    print('\n')
    print('\n')
    val arrInt = arrayOf(1, 2, 3, 4)
    for (i in arrInt) println("values of the array " +i)

    print('\n')
    val listInt = listOf(1, 22, 83, 4)
    for ((index, value) in listInt.withIndex()) {
        println("the element at $index is $value")
    }
}