fun triangle(a: Double, b: Double, c: Double): String {
    if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a){
        if (a == b && b == c) {
            return "Equilateral triangle"
        } else if (a == b || a == c) {
            return "Isosceles triangle"
        } else {
            return "Scalene triangle"
        }
    }
    else if ( a > 0 || b > 0 || c > 0 && (a + b == c || b + c == a || a + c  == b)){
        return "Degenerate triangle"
    }
    else{
        return ("Not a triangle")
    }
}
fun main() {
    print("Sides a: ")
    val a: Double = readLine()!!.toDouble()
    print("Sides b: ")
    val b: Double = readLine()!!.toDouble()
    print("Sides c: ")
    val c: Double = readLine()!!.toDouble()

    println("This is ${triangle(a,b,c)}")
}
