fun main() {
    var x:Int
    println("Example of Break and Continue in For-Loop")
    for(x in 1..10) {
        if(x == 7) break
        if(x == 3) continue
        print("$x ")
        // hasil nyya akan 1 2 4 5 6 karna ketika x nya ada 7 maka dia akan berhenti dan jika x ada angka 3 maka
        // dia akan melanjutkan ke angka selanjutnya
    }
    print('\n')
}