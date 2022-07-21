package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowId
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView:ListView=findViewById(R.id.static_list_view)
//        listView.onItemClickListener=this
    }

//    override fun onItemClick(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
//        var items:String =parent?.getItemAtPosition(position) as String
//        Toast.makeText(applicationContext,"clicked by item: $items",Toast.LENGTH_LONG).show()
//    }
}