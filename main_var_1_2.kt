fun drawCircleWithFor(radius: Int) {
    for (x in 0..(2 * radius)) {
        val y = Math.sqrt((radius * radius - (x - radius) * (x - radius)).toDouble()).toInt()
        println(" ".repeat(radius - y) + "*".repeat(2 * y))
    }
}
