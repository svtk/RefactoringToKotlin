package nullability

import java.util.*

object AnimalOfTheDay {
    val animal: Animal
        get() = if (Random().nextBoolean()) Cat() else Tiger()
}

fun patAnimalOfTheDay() {
    if (AnimalOfTheDay.animal !is Cat) error("That's not a cat!")
//    AnimalOfTheDay.animal.murmur()
}

fun patAnimalOfTheDay1() {
    val cat = AnimalOfTheDay.animal as? Cat ?: error("That's not a cat!")
    cat.murmur()
}
