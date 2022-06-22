package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(private val list: List<UniversityData>, private val onClick:(String) -> (Unit)) : RecyclerView.Adapter<ItemAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemAdapter(LayoutInflater.from(parent.context).inflate(R.layout.item_rv,parent, false))

    override fun onBindViewHolder(holder: ItemAdapter, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {
            onClick.invoke(list[position].name)
        }
    }

    override fun getItemCount() = list.size
}

class ItemAdapter(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(universityData: UniversityData) {
        val textName = itemView.findViewById<TextView>(R.id.textView3)
        val textHost = itemView.findViewById<TextView>(R.id.textView4)

        textName.text = universityData.name
        textHost.text = universityData.domains[0]
    }
}