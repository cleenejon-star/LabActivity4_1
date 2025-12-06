package com.example.labactivity4_1


class IntegrationTestApplication : LabApplication() {
    override fun onCreate() {
        super.onCreate()
        // Replace listLoader with one that has NO delay
        listLoader = object : ListLoader() {
            override fun loadItems(count: Int, callback: (List<ListItem>) -> Unit) {
                // Return immediately, no Handler
                val list = ArrayList<ListItem>()
                for (i in 0 until count) list.add(ListItem("Item $i"))
                callback(list)
            }
        }
    }
}