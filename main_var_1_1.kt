fun drawCircleWithWhile(radius: Int) {
    var x = 0
    while (x <= 2 * radius) {
        val y = Math.sqrt((radius * radius - (x - radius) * (x - radius)).toDouble()).toInt()
        println(" ".repeat(radius - y) + "*".repeat(2 * y))
        x++
    }
}