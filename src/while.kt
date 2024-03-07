fun findPrimesWhile(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    var num = 2
    while (num < n) {
        var isPrime = true
        var i = 2
        while (i * i <= num) {
            if (num % i == 0) {
                isPrime = false
                break
            }
            i++
        }
        if (isPrime) primes.add(num)
        num++
    }
    return primes
}

fun main() {
    println("Введите число:")
    val number = readLine()?.toIntOrNull() ?: return

    println("Простые числа, меньшие $number")
    println("С использованием while: ${findPrimesWhile(number)}")
}