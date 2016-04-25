package nullability


interface Animal
class Cat : Animal {
    fun murmur() = println("murmur")
}
class Tiger : Animal

fun patCat(animal: Animal) {
    if (!(animal is Cat)) error("That's not a cat!")
    val cat = animal as Cat

    println("Patting cat...")
    cat.murmur()
}

fun patCat1(animal: Animal) {
    if (animal !is Cat) error("That's not a cat!")

    println("Patting cat...")
    animal.murmur()
}

fun patCat2(animal: Animal) {
    val cat = animal as? Cat ?: error("That's not a cat!")

    println("Patting cat...")
    cat.murmur()
}

