package com.kuv.ui.monitoring.ui.standard

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kuv.R

import com.kuv.ui.monitoring.ui.standard.placeholder.PlaceholderContent.PlaceholderItem
import com.kuv.databinding.FragmentStandardBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class StandardItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<StandardItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentStandardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        //holder.idView.text = item.id
       // holder.contentView.text = item.content
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentStandardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.title
        val contentView: TextView = binding.description

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}