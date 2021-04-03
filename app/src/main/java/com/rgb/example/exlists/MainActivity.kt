package com.rgb.example.exlists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.rgb.example.exlists.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val data = listOf("A", "B", "C")
        mBinding.mainRecyclerView.layoutManager = LinearLayoutManager(this)
        mBinding.mainRecyclerView.adapter = MyAdapter(data, {item:String -> onItemSelected(item)})
    }

    fun onItemSelected(item: String){
        Toast.makeText(this, "Selected $item", Toast.LENGTH_SHORT).show()
    }
}