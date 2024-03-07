fun findPrimesFor(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    for (num in 2 until n) {
        var isPrime = true
        for (i in 2..(num / 2)) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) primes.add(num)
    }
    return primes
}

fun main() {
    println("Введите число:")
    val number = readLine()?.toIntOrNull() ?: return

    println("Простые числа, меньшие $number")
    println("С использованием for: ${findPrimesFor(number)}")
}