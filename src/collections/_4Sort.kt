package collections.e2

import java.util.*
import kotlin.comparisons.compareBy
import kotlin.comparisons.thenBy

data class Person(val name: String, val age: Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        val compareAges = age.compareTo(other.age)
        return if (compareAges != 0) compareAges else name.compareTo(other.name)
    }
}

fun q1(people: List<Person>) {
    //terrible!!!
    Collections.sort(people)

    people.sortedBy(Person::age)
    people.sortedWith(compareBy(Person::age).thenBy(Person::name))
}
