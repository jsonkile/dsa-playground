package dsa.playground.arrays.search


/**
 * Continues to split the ordered array into two halves
 * on each iteration, we check the 'mid' for a match
 * Big 0 - LogN
 */

fun Array<Int>.binarySearch(searchValue: Int): Int? {

    var lowerBound = 0
    var upperBound = this.size - 1

    do {

        val mid = (lowerBound + upperBound) / 2

        when {
            searchValue == this[mid] -> {
                return mid
            }

            searchValue < this[mid] -> {
                upperBound = mid - 1
            }

            searchValue > this[mid] -> {
                lowerBound = mid + 1
            }
        }

    } while (lowerBound <= upperBound)

    return null
}