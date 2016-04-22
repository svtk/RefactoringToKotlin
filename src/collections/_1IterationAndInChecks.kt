package collections.e0

fun q0(map: Map<Int, String>) {
    for (entry in map) {
        val key = entry.key
        val value = entry.value
    }

    map.get(42)
}

fun q1(list: List<String>) {
    var index = 0
    for (s in list) {
        println("" + index + ". " + s)
        index++
    }
}

fun a1(list: List<String>) {
    for ((index, s) in list.withIndex()) {
        println("$index. $s")
    }
}