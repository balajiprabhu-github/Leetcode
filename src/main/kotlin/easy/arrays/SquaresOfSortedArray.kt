package easy.arrays

import java.util.*

class SquaresOfSortedArray {

    companion object {

        fun sortedSquares(nums: IntArray): IntArray {

            val squaredArray = IntArray(nums.size)

            for ((index,num) in nums.withIndex()){
                squaredArray[index] = num*num
            }

            Arrays.sort(squaredArray)

            return squaredArray
        }

    }


}