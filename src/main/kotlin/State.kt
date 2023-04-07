enum class State(val next: Int, val signal: String) {
    Z1(2, "y1"),
    Z2(0, "y2"),
    Z3(6, "y3"),
    Z4(5, "y4"),
    Z5(1, "y1"),
    Z6(4, "y2"),
    Z7(3, "y3"),
}