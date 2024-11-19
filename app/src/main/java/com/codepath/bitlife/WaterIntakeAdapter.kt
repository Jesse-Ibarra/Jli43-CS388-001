package com.codepath.bitlife

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codepath.bitlife.data.DisplayWaterIntake
import java.text.SimpleDateFormat
import java.util.*

class WaterIntakeAdapter(
    private val context: Context,
    private val entries: MutableList<DisplayWaterIntake>
) : RecyclerView.Adapter<WaterIntakeAdapter.ViewHolder>() {

    private val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dateTextView: TextView = itemView.findViewById(R.id.itemDate)
        val amountTextView: TextView = itemView.findViewById(R.id.itemAmount)

        init {
            itemView.setOnClickListener {
                val position = absoluteAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val entry = entries[position]
                    val intent = Intent(context, DetailActivity::class.java).apply {
                        putExtra(
                            DetailActivity.WATER_INTAKE_EXTRA,
                            SerializableWaterIntake.fromDisplayWaterIntake(entry)
                        )
                    }
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_article, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = entries.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val entry = entries[position]
        holder.dateTextView.text = dateFormat.format(entry.date)
        holder.amountTextView.text = "${entry.amount} ml"
    }

    fun updateEntries(newEntries: List<DisplayWaterIntake>) {
        entries.clear()
        entries.addAll(newEntries)
        notifyDataSetChanged()
    }
}