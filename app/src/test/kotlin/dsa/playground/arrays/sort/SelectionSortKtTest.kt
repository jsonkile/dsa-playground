package dsa.playground.arrays.sort

import dsa.playground.arrays.sort.selectionSort
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SelectionSortKtTest {

    @Test
    fun testSelectionSearch() {
        Assertions.assertArrayEquals(arrayOf(1, 2, 2, 3, 4, 5, 7, 10), arrayOf(2, 5, 4, 1, 3, 10, 7, 2).selectionSort())
        Assertions.assertArrayEquals(arrayOf(1, 2, 7, 7, 8, 10), arrayOf(10, 7, 2, 8, 7, 1).selectionSort())
        Assertions.assertArrayEquals(arrayOf(1, 2), arrayOf(2, 1).selectionSort())
        Assertions.assertArrayEquals(arrayOf(1), arrayOf(1).selectionSort())
    }
}