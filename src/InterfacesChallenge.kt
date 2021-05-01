
//Challenge 1:
//  - Create an interface `Shape` that defines a property `area` of type Double.
//  - Implement `Shape` with classes representing Square, Triangle, and Circle.
//  - Add a circle, a square, and a triangle to an array.
//  - Convert the array of shapes to an array of areas using map.
// **HINTS**
// - The area of a square = one of its sides squared
// - The area of a triangle = 0.5 multiplied by its base multiplied by its height

interface Shape {
  val area: Double
}

val Double.squared
  get() = this * this

class Square(val side: Double): Shape {
  override val area: Double
    get() = side.squared
}

class Triangle(val base: Double, val height: Double): Shape {
  override val area: Double
    get() = 0.5 * base * height
}

class Circless(val radius: Double): Shape {
  override val area: Double
    get() = kotlin.math.PI * radius.squared
}

fun main() {
  val square = Square(4.0)
  val triangle = Triangle(3.0, 5.0)
  val circles = Circless(2.0)

  val shapes = arrayOf(square, triangle, circles)
  val areas = shapes.map { it.area }
  println(areas)
}
