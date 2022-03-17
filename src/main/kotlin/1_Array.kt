fun main() {
    //Array
    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])

    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }
    for (i in arrB) {
        print("$i ")
    }

    /*
    array merupakan koleksi data yang sejenis atau kumpulan data dengan tipe yang sama.
    var arrA akan mencetak nilai 34 karna indek yang dikasi adalah 0 yaitu nilai utama dari array tersebut, jika kita menggantikan menjadi angka 4
    maka akan terjadi error.

    var arrB akan mencetak nilai dengan range dari 1 sampai 10.
     */
}