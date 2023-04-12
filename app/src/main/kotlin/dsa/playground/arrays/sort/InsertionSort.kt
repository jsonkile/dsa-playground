package dsa.playground.arrays.sort


/**
 * We start a loop from the second item of the array (let's call each x)
 * Then we compare each (x) value against preceding values
 * each time we find a greater value, we move that value forward and fill the position with x
 * Big 0 - N² (Ignoring constants)
 */

fun Array<Int>.insertionSort(): Array<Int> {

    if (this.size < 2) return this

    for (i in 1 until this.size) {
        val temp = this[i]
        var currentGapIndex = i
        for (j in i - 1 downTo 0) {
            if (temp < this[j]) {
                this[j + 1] = this[j]
                currentGapIndex = j
            }
            this[currentGapIndex] = temp
        }
    }

    return this
}