fun main() {
    fun `create map using infix to function`() {
        val map = mapOf("a" to 1,"b" to 2,"c" to 2)
    }

    fun `create a Pair from constructor vs to function`() {
        val p1 = Pair("a", 1)
        val p2 = "a" to 1
        val p3 = 10 to 1

        println(p1.first)
        println(p1)
        println(p2.first)
        println(p2.second)
        println(p1.equals(p2))

        println(p3)
    }

    `create a Pair from constructor vs to function`()
}