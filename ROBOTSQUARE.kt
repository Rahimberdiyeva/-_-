class ROBOTSQUARE(var x: Int, var y: Int, var side: Int) : Transforming {

    fun area(): Float {
        return (side * side).toFloat()
    }

    override fun rotate(degrees: Float) {
        // Квадрат не меняет форму при вращении, просто оставим пустым
    }

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun scale(factor: Float) {
        side = (side * factor).toInt()
    }
}
