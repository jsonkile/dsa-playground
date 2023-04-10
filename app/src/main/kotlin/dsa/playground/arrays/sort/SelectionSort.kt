package dsa.playground.arrays.sort

fun Array<Int>.selectionSort(): Array<Int> {

    if (this.size < 2) return this

    for (i in 0 until this.size) {
        var lowestValueIndex = i
        for (j in i + 1 until this.size) {
            if (this[lowestValueIndex] > this[j]) lowestValueIndex = j
        }

        if (this[i] != this[lowestValueIndex]) {
            val temp = this[i]
            this[i] = this[lowestValueIndex]
            this[lowestValueIndex] = temp
        }
    }

    return this
}