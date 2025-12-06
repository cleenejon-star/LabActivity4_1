package com.example.labactivity4_1


import androidx.test.filters.SmallTest
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
@SmallTest
class ListLoaderTest {
    @Test
    fun testLoadItems() {
        val loader = ListLoader()

        loader.loadItems(3) { list ->
            assertEquals(3, list.size)
            assertEquals("Item 0", list[0].text)
        }
    }
}