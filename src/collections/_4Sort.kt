package collections.e2

import kotlin.comparisons.compareBy
import kotlin.comparisons.thenBy

data class Person(val name: String, val age: Int)

fun q1(people: List<Person>) {
//    Collections.sort(people)

    people.sortedWith(
            compareBy { p: Person -> p.name }
            .thenBy { p: Person -> p.age })
}
