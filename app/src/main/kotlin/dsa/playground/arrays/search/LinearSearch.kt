package dsa.playground.arrays.search

/**
 * Crawls through the array sequentially until it finds a match
 * Big 0 - N
 */

fun Array<Int>.linearSearch(searchValue: Int): Int? {

    for (index in 0 until this.size) {
        if (searchValue == this[index]) return index
    }

    return null
}