package easy.arrays

import org.junit.Assert.*
import org.junit.Test

class NumberOfGoodPairsTest {


    @Test
    fun `numIdenticalPairs Given an array of integers nums Return the number of good pairs`() {

        assertEquals(
            4,
            NumberOfGoodPairs.numIdenticalPairs(intArrayOf(1,2,3,1,1,3))
        )

        assertEquals(
            6,
            NumberOfGoodPairs.numIdenticalPairs(intArrayOf(1,1,1,1))
        )

        assertEquals(
            0,
            NumberOfGoodPairs.numIdenticalPairs(intArrayOf(1,2,3))
        )

    }
}