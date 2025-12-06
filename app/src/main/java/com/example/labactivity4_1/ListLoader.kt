package com.example.labactivity4_1

import android.os.Handler
import android.os.Looper
import androidx.test.espresso.idling.CountingIdlingResource

// Data Class for RecyclerView
data class ListItem(val text: String)

open class ListLoader {
    // IdlingResource for Espresso synchronization
    val idlingResource = CountingIdlingResource("ListLoader")

    open fun loadItems(count: Int, callback: (List<ListItem>) -> Unit) {
        idlingResource.increment()

        // Simulate 1 second delay [cite: 6]10
        Handler(Looper.getMainLooper()).postDelayed({
            val list = ArrayList<ListItem>()
            for (i in 0 until count) {
                list.add(ListItem("Item $i"))
            }
            callback(list)
            idlingResource.decrement() // Tell Espresso we are done
        }, 1000)
    }
}