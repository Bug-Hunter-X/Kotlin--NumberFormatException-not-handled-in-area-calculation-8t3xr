```kotlin
fun calculateArea(length: Double, width: Double): Double {
    if (length < 0 || width < 0) {
        throw IllegalArgumentException("Length and width must be non-negative")
    }
    return length * width
}

fun main() {
    print("Enter length: ")
    val length = readLine()?.toDoubleOrNull() ?: run {
        println("Invalid input. Length must be a number."); return
    }
    print("Enter width: ")
    val width = readLine()?.toDoubleOrNull() ?: run {
        println("Invalid input. Width must be a number."); return
    }
    try {
        val area = calculateArea(length, width)
        println("Area: $area")
    } catch (e: IllegalArgumentException) {
        println("Error: "+e.message)
    }
}
```