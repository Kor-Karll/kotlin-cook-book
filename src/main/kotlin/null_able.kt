fun main() {
    class Person(
        val first: String,
        val middle: String?,
        val last: String,
    )

    val jkRowling = Person("Joanne", null, "Rowling")
    val northWest = Person("North", null, "West")

    print(jkRowling.first)
    print(northWest.last)
}