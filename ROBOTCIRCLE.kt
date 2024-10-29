class ROBOTCIRCLE(var x: Int, var y: Int, var radius: Int) : Transforming {

    fun area(): Float {
        return Math.PI.toFloat() * radius * radius
    }

    override fun rotate(degrees: Float) {
        // Циркуль не меняет положение при вращении, поэтому ничего не делаем
    }

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun scale(factor: Float) {
        radius = (radius * factor).toInt()
    }
}
