package easy.arrays

class NumberOfGoodPairs {

    companion object {

        fun numIdenticalPairs(nums: IntArray): Int {

            var count = 0
            for((i,num) in nums.withIndex()){
                for((j,_num) in nums.withIndex()){
                    if(i!=j && num == _num){
                        count++
                    }
                }
            }

            return count/2

        }
    }
}