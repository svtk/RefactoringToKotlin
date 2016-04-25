package collections

data class Person(val name: String, val age: Int)

fun q(people: List<Person>) {
    var max = 0
    var oldest: Person? = null
    for (person in people) {
        if (person.age > max) {
            max = person.age
            oldest = person
        }
    }
    println(oldest)
}

fun a(people: List<Person>) {
    val oldest = people.maxBy { it.age }
}