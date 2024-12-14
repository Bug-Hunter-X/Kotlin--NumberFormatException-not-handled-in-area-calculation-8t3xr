```kotlin
fun calculateArea(length: Double, width: Double): Double {
    if (length < 0 || width < 0) {
        throw IllegalArgumentException("Length and width must be non-negative")
    }
    return length * width
}

fun main() {
    val length = readLine()!!.toDouble()
    val width = readLine()!!.toDouble()
    try {
        val area = calculateArea(length, width)
        println("Area: $area")
    } catch (e: IllegalArgumentException) {
        println("Error: "+e.message)
    }
}
```