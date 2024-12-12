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
                "UNITED STATES", "CANADA", "MEXICO", "BRAZIL", "ARGENTINA",
                "UNITED KINGDOM", "GERMANY", "FRANCE", "ITALY", "SPAIN",
                "CHINA", "JAPAN", "INDIA", "SOUTH KOREA", "AUSTRALIA",
                "RUSSIA", "SOUTH AFRICA", "EGYPT", "NIGERIA", "KENYA"
            )

            val listView: ListView = findViewById(R.id.countryListView)

            val adapter = ArrayAdapter(this, R.layout.country_list, countryList)

            // Set the adapter to the ListView
            listView.adapter = adapter

        }
    }

