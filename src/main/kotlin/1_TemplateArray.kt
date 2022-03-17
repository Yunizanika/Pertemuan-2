fun main() {
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }

    /*
    berikut adalah contoh pembuatan array berdasarkan template array standard pada kotlin.
    codingan diatas telah ditentuan index array yang akan ditampilkan yaitu dengan size indexnya 5, sehingga akan dilakukan penambahan 5 dari
    0 sehingga hasilnya: 0 1 4 9 16
     */
}