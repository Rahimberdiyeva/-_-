class ROBOTRECT(var x: Int, var y: Int, val width: Int, val height: Int) : Transforming {

    var color: Int = -1

    constructor(rect: ROBOTRECT) : this(rect.x, rect.y, rect.width, rect.height)

    fun area(): Float {
        return (width * height).toFloat()
    }

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun rotate(degrees: Float) {
        // Прямоугольник не меняет свою форму при вращении, но можно добавить логику
    }

    override fun scale(factor: Float) {
        // Здесь можно реализовать изменение размеров
    }
}
