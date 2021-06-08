package easy.arrays

import org.junit.Test

import org.junit.Assert.*

class ShuffleTheArrayTest {

    @Test
    fun shuffle_giveArraysOfNumber_returnShuffledArray() {

        assertEquals(
            intArrayOf(2,3,5,4,1,7).toList().toString(),
            ShuffleTheArray.shuffle(intArrayOf(2,5,1,3,4,7),3).toList().toString()
        )

        assertEquals(
            intArrayOf(1,4,2,3,3,2,4,1).toList().toString(),
            ShuffleTheArray.shuffle(intArrayOf(1,2,3,4,4,3,2,1),4).toList().toString()
        )

        assertEquals(
            intArrayOf(1,2,1,2).toList().toString(),
            ShuffleTheArray.shuffle(intArrayOf(1,1,2,2),2).toList().toString()
        )

    }
}