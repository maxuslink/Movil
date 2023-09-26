fun main() {
    println("Area con valores por defecto: ${Prism()}")
}

fun ReArea(b:Double = 10.0, h:Double = 5.0) : Double {
    return b * h
}

fun Prism(l:Double = 10.0) : Double {
    return ReArea() * l
}