package lat.pam.recyclerviewsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // LayoutManager vertikal
        recyclerview.layoutManager = LinearLayoutManager(this)

        // Data dummy: Item 1 sampai Item 20
        val data = ArrayList<ItemsViewModel>()
        for (i in 1..20) {
            data.add(ItemsViewModel("Item $i"))
        }

        val adapter = CustomAdapter(data)
        Log.d("test string", "Jumlah data: " + data.size)

        recyclerview.adapter = adapter
    }
}