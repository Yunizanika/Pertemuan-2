fun main() {
    /* index array nya telah ditentukan yaitu 1, 2, 3, dan akan dieksekusi yaitu index 0 akan diganti dengan melakukan
    penabahan indek 1 + dengan index 2 maka hasilnya akan berubah menjadi 5, 2, 3. dan fungsi ' ' itu untuk tampilan nya agar kesamping
    bukan kebawah.
    */
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ') }
    print('\n')

    /*
    byte array telah ditentukan dengan size 5  yang artinya dia akan mencetak nilai 0 sampai 5 karna byte nya 0
     */
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')

    /*
    Akan mencetak nilai 42 dengan size nya 5 atau akan dicetak menjadi 5
     */
    val shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')

    // akan mencetak 0 sampai 4 karna size indexnya 5
    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}