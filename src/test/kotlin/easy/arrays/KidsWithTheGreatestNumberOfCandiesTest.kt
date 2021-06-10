package easy.arrays

import org.junit.Test

import org.junit.Assert.*

class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    fun kidsWithCandies_givenAnArrayOfNumbersKidsWithMaxCandies_returnTrue() {

        assertEquals(
            listOf(true,true,true,false,true),
            KidsWithTheGreatestNumberOfCandies.kidsWithCandies(intArrayOf(2,3,5,1,3),3)
        )

        assertEquals(
            listOf(true,false,false,false,false),
            KidsWithTheGreatestNumberOfCandies.kidsWithCandies(intArrayOf(4,2,1,1,2),1)
        )

        assertEquals(
            listOf(true,false,true),
            KidsWithTheGreatestNumberOfCandies.kidsWithCandies(intArrayOf(12,1,12),10)
        )

        assertEquals(
            listOf(false,true,true),
            KidsWithTheGreatestNumberOfCandies.kidsWithCandies(intArrayOf(2,8,7),1)
        )

    }
}