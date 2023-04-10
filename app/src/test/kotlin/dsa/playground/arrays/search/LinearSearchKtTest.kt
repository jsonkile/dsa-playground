package dsa.playground.arrays.search

import dsa.playground.arrays.search.linearSearch
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LinearSearchKtTest {

    @Test
    fun testLinearSearch() {
        assertEquals(2, arrayOf(1, 2, 3, 4, 5).linearSearch(3))
        assertEquals(null, arrayOf(1, 2, 3, 4, 5).linearSearch(10))
        assertEquals(9, arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 56, 408).linearSearch(10))
    }
}