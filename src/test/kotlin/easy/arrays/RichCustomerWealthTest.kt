package easy.arrays

import org.junit.Test

import org.junit.Assert.*

class RichCustomerWealthTest {

    @Test
    fun maximumWealth_givenAnArrayOfNumbers_returnMaxWealth() {

        assertEquals(
            6,
            RichCustomerWealth.maximumWealth(arrayOf(intArrayOf(1,2,3),intArrayOf(3,2,1)))
        )

        assertEquals(
            10,
            RichCustomerWealth.maximumWealth(arrayOf(intArrayOf(1,5),intArrayOf(7,3), intArrayOf(3,5)))
        )

        assertEquals(
            17,
            RichCustomerWealth.maximumWealth(arrayOf(intArrayOf(2,8,7),intArrayOf(7,1,3),intArrayOf(1,9,5)))
        )

    }
}