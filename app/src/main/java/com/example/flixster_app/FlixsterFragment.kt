package com.example.flixster_app

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.ContentLoadingProgressBar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.RequestParams
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import com.google.gson.Gson
import okhttp3.Headers
import org.json.JSONArray
import org.json.JSONObject

private const val API_KEY = "fa34fb10fe7189bd0676547c5f9bca06"

class FlixsterFragment : Fragment(), OnListFragmentInteractionListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_flixster_list, container, false)
        val progressBar = view.findViewById<View>(R.id.progress) as ContentLoadingProgressBar
        val recyclerView = view.findViewById<View>(R.id.list) as RecyclerView
        val context = view.context
        recyclerView.layoutManager = GridLayoutManager(context, 1)
        updateAdapter(progressBar, recyclerView)
        return view
    }

    private fun updateAdapter(progressBar: ContentLoadingProgressBar, recyclerView: RecyclerView) {
        progressBar.show()

        val client = AsyncHttpClient()
        val params = RequestParams()
        params["api-key"] = API_KEY

        client.get(
            "https://api.themoviedb.org/3/movie/now_playing?api_key=$API_KEY",
            params,
            object : JsonHttpResponseHandler() {

                override fun onSuccess(
                    statusCode: Int,
                    headers: Headers,
                    json: JsonHttpResponseHandler.JSON
                ) {
                    progressBar.hide()
                    Log.d("FlixsterFragment", "API response: ${json.jsonObject}") // Log the response

                    // Correctly cast results as JSONArray
                    val resultsArray: JSONArray = json.jsonObject.getJSONArray("results")

                    // Parse the array into movie models
                    val models = mutableListOf<Flixster>()
                    for (i in 0 until resultsArray.length()) {
                        val movieJSON = resultsArray.getJSONObject(i)
                        val movie = parseJsonToModel(movieJSON)
                        models.add(movie)
                    }

                    Log.d("FlixsterFragment", "Parsed movies: $models")  // Check the parsed movie models

                    recyclerView.adapter = FlixsterRecyclerViewAdapter(models, this@FlixsterFragment)
                }

                override fun onFailure(
                    statusCode: Int,
                    headers: Headers?,
                    errorResponse: String,
                    t: Throwable?
                ) {
                    progressBar.hide()
                    Log.e("FlixsterFragment", errorResponse)
                }
            }
        )
    }

    private fun parseJsonToModel(movieJSON: JSONObject): Flixster {
        val gson = Gson()
        return gson.fromJson(movieJSON.toString(), Flixster::class.java)
    }

    override fun onItemClick(item: Flixster) {

    }
}
