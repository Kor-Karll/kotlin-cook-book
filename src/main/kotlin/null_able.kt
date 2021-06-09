/**
    2장_코틀린 기초
    2.1 코틀린에서 널 허용 타입 사용하기
 */
fun main() {
    class Person(
        val first: String,
        val middle: String?,
        val last: String,
    )

    val jkRowling = Person("Joanne", null, "Rowling")
    val northWest = Person("North", null, "West")

//    print(jkRowling.first)
//    print(northWest.last)

    val p = Person(first = "North", middle = null, last = "West")

    if(p.middle != null) {
        val middleNameLength = p.middle.length
        println(middleNameLength)
    }

    var p2 = Person(first = "North", middle = null, last = "West")

    if(p2.middle != null) {
//        val middleNameLength = p2.middle.length
        val middleNameLength = p2.middle!!.length // 절대비추 코드
    }

    // 안전 호출 연산자 사용하기
    var p3 = Person(first = "North", middle = null, last = "West")
    val middleNameLength = p3.middle?.length ?: 0

    // 안전 타입 변환 연산자 as?
    val p1 = p as? Person
}