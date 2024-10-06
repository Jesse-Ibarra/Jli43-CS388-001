package com.example.flixster_app

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FlixsterRecyclerViewAdapter(
    private val movies: List<Flixster>,
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<FlixsterRecyclerViewAdapter.MovieViewHolder>() {

    // Inflate the layout for each movie item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_flixster, parent, false)
        return MovieViewHolder(view)
    }

    inner class MovieViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: Flixster? = null
        val mmovieTitle: TextView = mView.findViewById(R.id.title)
        val mmovieDescription: TextView = mView.findViewById(R.id.description)
        val mmoviePoster: ImageView = mView.findViewById(R.id.movie_image)

        override fun toString(): String {
            return mmovieTitle.toString() + " '" + mmovieDescription.text + "'"
        }
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        Log.d("FlixsterAdapter", "Binding movie: ${movie.title}")

        // Glide setup with placeholder and error handling
        Glide.with(holder.itemView)
            .load(movie.getPosterUrl())
            .placeholder(R.drawable.placeholder_image) //Image seen during loading
            .error(R.drawable.error_image) //Image if poster cannot be loaded
            .centerInside()
            .into(holder.mmoviePoster)

        holder.mItem = movie
        holder.mmovieTitle.text = movie.title
        holder.mmovieDescription.text = movie.description

        // Handle click on the movie item
        holder.itemView.setOnClickListener {
            holder.mItem?.let { movie ->
                mListener?.onItemClick(movie)
            }
        }
    }

    // Return the total number of items
    override fun getItemCount(): Int {
        return movies.size
    }
}
