package easy.arrays

import org.junit.Test

import org.junit.Assert.*

class SquaresOfSortedArrayTest {

    @Test
    fun `Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order`() {

        assertEquals(
            intArrayOf(0,1,9,16,100).toList().toString(),
            SquaresOfSortedArray.sortedSquares(intArrayOf(-4,-1,0,3,10)).toList().toString()
        )

        assertEquals(
            intArrayOf(4,9,9,49,121).toList().toString(),
            SquaresOfSortedArray.sortedSquares(intArrayOf(-7,-3,2,3,11)).toList().toString()
        )

    }
}