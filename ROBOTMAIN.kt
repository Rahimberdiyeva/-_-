fun main() {
    val figures: Array<Transforming> = arrayOf(
        ROBOTRECT(0, 0, 10, 5),
        ROBOTCIRCLE(0, 0, 5),
        ROBOTSQUARE(0, 0, 4)
    )

    figures.forEach { figure ->
        when (figure) {
            is ROBOTRECT -> {
                figure.move(1, 2)
                figure.scale(2.0f)
                println("Rect area after transformations: ${figure.area()}")
            }
            is ROBOTCIRCLE -> {
                figure.move(3, 4)
                figure.scale(1.5f)
                println("Circle area after transformations: ${figure.area()}")
            }
            is ROBOTSQUARE -> {
                figure.move(2, 2)
                figure.scale(2.0f)
                println("Square area after transformations: ${figure.area()}")
            }
        }
    }
}
