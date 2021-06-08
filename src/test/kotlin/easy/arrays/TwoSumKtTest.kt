package easy.arrays

import org.junit.Assert.assertEquals
import org.junit.Test


internal class TwoSumKtTest {

    @Test
    fun findIndices_whenSumOfAnyTwoNumberIsEqualToTarget_returnTheirIndices() {

        assertEquals(
            intArrayOf(0, 1).asList().toString(),
            TwoSum.findIndices(intArrayOf(2, 7, 11, 15), 9).asList().reversed().toString(),
        )

        assertEquals(
            intArrayOf(1,2).asList().toString(),
            TwoSum.findIndices(intArrayOf(3,2,4), 6).asList().reversed().toString(),
        )

        assertEquals(
            intArrayOf(0, 1).asList().toString(),
            TwoSum.findIndices(intArrayOf(3,3), 6).asList().reversed().toString(),
        )

    }
}