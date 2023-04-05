package arrays.sort

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class BubbleSortKtTest {

    @Test
    fun testBubbleSort() {
        Assertions.assertArrayEquals(arrayOf(1, 2, 2, 3, 4, 5, 7, 10), arrayOf(2, 5, 4, 1, 3, 10, 7, 2).bubbleSort())
    }
}