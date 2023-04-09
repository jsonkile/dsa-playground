package arrays.sort

/**
 * Crawls through the array and makes a swap where necessary
 * Big 0 - N² (In the worst case i.e. reverse ordered array, for each comparison in each pass, a swap is made)
 */

fun Array<Int>.bubbleSort(): Array<Int> {

    if (this.size < 2) return this

    var sorted = false
    var lastUnsortedIndex = this.size - 1

    while (!sorted) {
        sorted = true
        for (i in 0 until lastUnsortedIndex) {
            val pointerAValueHolder = this[i]
            if (this[i] > this[i + 1]) {
                this[i] = this[i + 1]
                this[i + 1] = pointerAValueHolder
                sorted = false
            }
        }

        lastUnsortedIndex -= 1
        if (sorted) break
    }

    return this
}