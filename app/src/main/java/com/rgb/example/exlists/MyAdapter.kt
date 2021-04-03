package com.rgb.example.exlists

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val data: List<String>, private val onclick:(String)->Unit) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position], onclick)
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textView : TextView = itemView.findViewById(R.id.item_text)

    fun bind(data: String, onClickListener: (String)-> Unit){
        textView.text = data
        itemView.setOnClickListener {
            onClickListener(data)
        }
    }
}