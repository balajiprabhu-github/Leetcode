package easy

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 * */

class TwoSum {

    companion object{

        fun findIndices(nums : IntArray, target: Int) : IntArray {

            val result = IntArray(2)

            for ((i,num) in nums.withIndex()){
                for ((j,_num) in nums.withIndex()){
                    if(num+_num == target){
                        result[0] = i
                        result[1] = j
                        break
                    }
                }
            }

            return result
        }
    }
}


