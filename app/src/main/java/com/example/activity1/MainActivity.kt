package com.example.activity1
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countryList = listOf(
            "United States", "Canada", "Mexico", "Brazil", "Argentina",
            "United Kingdom", "Germany", "France", "Italy", "Spain",
            "China", "Japan", "India", "South Korea", "Australia",
            "Russia", "South Africa", "Egypt", "Nigeria", "Kenya", "Saudi Arabia"
        )

        val listView: ListView = findViewById(R.id.countryLV)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryList)

        // Set the adapter to the ListView
        listView.adapter = adapter
    }
}

