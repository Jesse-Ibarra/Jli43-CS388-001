package com.example.email

import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.ViewHolder>() {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Member variables for the views
        val iconImageView: ImageView = itemView.findViewById(R.id.icon)
        val senderTextView: TextView = itemView.findViewById(R.id.sender)
        val dateTextView: TextView = itemView.findViewById(R.id.date)
        val titleTextView: TextView = itemView.findViewById(R.id.title)
        val summaryTextView: TextView = itemView.findViewById(R.id.summary)
    }

    // Inflate the layout when needed and return a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Bind data to the views
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val email = emails[position]

        // Set item views based on views and data model
        holder.senderTextView.text = email.sender
        holder.dateTextView.text = email.date
        holder.titleTextView.text = email.title
        holder.summaryTextView.text = email.summary
        holder.iconImageView.setImageResource(R.drawable.icon)

        if (email.isRead) {
            holder.titleTextView.setTypeface(null, Typeface.NORMAL)
            holder.summaryTextView.setTypeface(null, Typeface.NORMAL)
        } else {
            holder.titleTextView.setTypeface(null, Typeface.BOLD)
            holder.summaryTextView.setTypeface(null, Typeface.BOLD)
        }
        holder.itemView.setOnClickListener {
            email.isRead = true
            notifyItemChanged(position)  // Notify to update the item's appearance
        }
    }

    override fun getItemCount(): Int {
        return emails.size
    }
}
