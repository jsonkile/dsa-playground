package arrays

import arrays.search.binarySearch
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinarySearchKtTest {

    @Test
    fun testBinarySearch() {
        assertEquals(2, arrayOf(1, 2, 3, 4, 5).binarySearch(3))
        assertEquals(null, arrayOf(1, 2, 3, 4, 5).binarySearch(10))
        assertEquals(9, arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 56, 408).binarySearch(10))
    }

}