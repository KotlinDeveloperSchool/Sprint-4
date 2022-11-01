package ru.sber.generics

// 1.
fun <T> compare(p1: T, p2: T): Boolean {
    return p1 == p2
}

// 2.
fun <T : Comparable<T>> countGreaterThan(anArray: Array<T>, elem: T): Int =
    anArray.count { it > elem }


// 3.
class Sorter<T : Comparable<T>> {
    val list: MutableList<T> = ArrayList()

    fun add(value: T) {
        list.apply {
            add(
                this.count { elementInList -> elementInList < value },
                value
            )
        }
    }
}

// 4.
class Stack {

}
