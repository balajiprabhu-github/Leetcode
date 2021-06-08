package easy.arrays

import org.junit.Assert.assertEquals
import org.junit.Test


internal class RunningSumTest {

    @Test
    fun runningSum_givenAnArrayOfNumbers_returnRunningSum(){

        assertEquals(
            intArrayOf(1,3,6,10).toList().toString(),
            RunningSum.runningSum(intArrayOf(1,2,3,4)).toList().toString()
        )

        assertEquals(
            intArrayOf(1,2,3,4,5).toList().toString(),
            RunningSum.runningSum(intArrayOf(1,1,1,1,1)).toList().toString()
        )

        assertEquals(
            intArrayOf(3,4,6,16,17).toList().toString(),
            RunningSum.runningSum(intArrayOf(3,1,2,10,1)).toList().toString()
        )
    }
}