fun main() {
    /*
    Salah satu kesalahan yang banyak ditemukan pada bahasa pemrograman adalah pengaksesan
    terhadap anggota referensi null dan akan menghasilkan pesan kesalahan null reference exception,
    di Java sering disebut dengan Null Pointer Exception (NPE). Kotlin type system bertujuan untuk
    menghilangkan NPE dari kode program.
     */
    //Nullable types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}