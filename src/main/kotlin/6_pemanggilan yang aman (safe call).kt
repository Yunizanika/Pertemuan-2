fun main() {
    // pemanggilan yang aman
    // ?.membiarkan
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }
    //The ?. chaining
    //student?.teacher?.supervisor?.name = "Seymour Skinner"
}