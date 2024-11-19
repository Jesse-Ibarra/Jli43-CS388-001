package com.codepath.bitlife

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath.bitlife.data.DisplayWaterIntake
import com.codepath.bitlife.data.WaterIntakeEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var recyclerView: RecyclerView
    private val entries = mutableListOf<DisplayWaterIntake>()
    private lateinit var adapter: WaterIntakeAdapter
    private lateinit var dateInput: EditText
    private var selectedDate: Date? = null
    private val dateFormat = SimpleDateFormat("MM-dd-yyyy", Locale.getDefault())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
        adapter = WaterIntakeAdapter(requireContext(), entries)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        dateInput = view.findViewById(R.id.dateInput)
        dateInput.isFocusable = false
        dateInput.setOnClickListener {
            showDatePickerDialog()
        }

        val db = (requireActivity().application as WaterIntakeApplication).db

        loadEntries(db)

        val addButton = view.findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {
            val amount = view.findViewById<EditText>(R.id.amountInput).text.toString().toIntOrNull()

            if (selectedDate != null && amount != null && amount > 0) {
                val newEntry = WaterIntakeEntity(date = selectedDate!!, amount = amount)

                lifecycleScope.launch(Dispatchers.IO) {
                    db.waterIntakeDao().insertAll(listOf(newEntry))
                    loadEntries(db)
                    withContext(Dispatchers.Main) {
                        dateInput.text.clear()
                        view.findViewById<EditText>(R.id.amountInput).text.clear()
                        selectedDate = null
                        Toast.makeText(requireContext(), "Entry added", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(requireContext(), "Please enter valid data", Toast.LENGTH_SHORT).show()
            }
        }

        val clearButton = view.findViewById<Button>(R.id.clearButton)
        clearButton.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                db.waterIntakeDao().deleteAllEntries()

                withContext(Dispatchers.Main) {
                    entries.clear()
                    adapter.notifyDataSetChanged()
                    Toast.makeText(requireContext(), "All entries deleted", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            requireContext(),
            { _, selectedYear, selectedMonth, selectedDay ->
                calendar.set(selectedYear, selectedMonth, selectedDay)
                selectedDate = calendar.time
                dateInput.setText(dateFormat.format(selectedDate!!))
            },
            year, month, day
        )
        datePickerDialog.show()
    }

    private fun loadEntries(db: AppDatabase) {
        lifecycleScope.launch(Dispatchers.IO) {
            val databaseList = db.waterIntakeDao().getAllEntries().first()
            val mappedList = databaseList.map { entity ->
                DisplayWaterIntake(entity.date, entity.amount)
            }
            withContext(Dispatchers.Main) {
                adapter.updateEntries(mappedList)
            }
        }
    }
}