fun main() {
    //Set<T> stores unique elements; their order is generally undefined.
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
    // Implementasi default dari Set – LinkedHashSet – mempertahankan urutan elemen yang dimasukkan
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())
    val strings = hashSetOf("a", "b", "c", "c") //hash set nilai unik
    println("My Set Values are"+strings)
}