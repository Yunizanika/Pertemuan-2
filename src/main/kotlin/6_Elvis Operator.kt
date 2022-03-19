fun main() {
    //Operator Elvis ?:
    /*
    Elvis Operator juga merupakan safe call pada nullable type, jadi ketika tidak null maka kita menggunakan nilainya, namun ketika null maka kita akan menggunakan default value nya.
     */
    var maybeWelcome: String? = "Hello world"

    println(maybeWelcome?.length ?: 0)
}