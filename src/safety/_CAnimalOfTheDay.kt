package safety

import java.util.*

object AnimalOfTheDay {
    val animal: Animal
        get() = if (Random().nextBoolean()) Cat() else Tiger()
}
