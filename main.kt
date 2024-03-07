// Рисование круга с использованием цикла while
fun drawCircleWithWhile(radius: Int) {
    require(radius > 0) { "Радиус должен быть целым положительным числом" }
    var x = radius
    var y = 0
    var decision = 1 - radius

    while (y <= x) {
        drawPixel(x, y)
        drawPixel(y, x)
        drawPixel(-x, y)
        drawPixel(y, -x)
        drawPixel(-x, -y)
        drawPixel(-y, -x)
        drawPixel(x, -y)
        drawPixel(-y, x)

        y++
        if (decision <= 0) {
            decision += 2 * y + 1
        } else {
            x--
            decision += 2 * (y - x) + 1
        }
    }
}

// Рисование круга с использованием цикла for
fun drawCircleWithFor(radius: Int) {
    require(radius > 0) { "Радиус должен быть целым положительным числом" }
    for (x in 0..radius) {
        val y = Math.sqrt((radius * radius - x * x).toDouble()).toInt()
        drawPixel(x, y)
        drawPixel(-x, y)
        drawPixel(x, -y)
        drawPixel(-x, -y)
        drawPixel(y, x)
        drawPixel(-y, x)
        drawPixel(y, -x)
        drawPixel(-y, -x)
    }
}
