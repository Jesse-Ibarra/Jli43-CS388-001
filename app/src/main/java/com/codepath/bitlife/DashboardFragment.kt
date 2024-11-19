package com.codepath.bitlife

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Locale

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    private lateinit var lineChart: LineChart
    private lateinit var totalIntakeTextView: TextView
    private lateinit var averageIntakeTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lineChart = view.findViewById(R.id.intakeChart)
        totalIntakeTextView = view.findViewById(R.id.totalIntake)
        averageIntakeTextView = view.findViewById(R.id.averageIntake)

        val db = (requireActivity().application as WaterIntakeApplication).db

        loadDashboardData(db)
    }
    private fun loadDashboardData(db: AppDatabase) {
        lifecycleScope.launch(Dispatchers.IO) {
            val entries = db.waterIntakeDao().getAllEntries().first().sortedBy { it.date }
            val totalIntake = entries.sumOf { it.amount }
            val averageIntake = if (entries.isNotEmpty()) totalIntake / entries.size else 0

            val chartEntries = entries.mapIndexed { index, entry ->
                Entry(index.toFloat(), entry.amount.toFloat())
            }

            val dateFormat = SimpleDateFormat("MM-dd", Locale.getDefault())
            val dates = entries.map { dateFormat.format(it.date) }

            withContext(Dispatchers.Main) {
                totalIntakeTextView.text = "Total Intake: $totalIntake ml"
                averageIntakeTextView.text = "Average Intake: $averageIntake ml"

                if (chartEntries.isNotEmpty()) {
                    val dataSet = LineDataSet(chartEntries, "Water Intake")
                    dataSet.valueTextSize = 12f
                    val lineData = LineData(dataSet)
                    lineChart.data = lineData

                    lineChart.xAxis.valueFormatter = IndexAxisValueFormatter(dates)
                    lineChart.xAxis.granularity = 1f
                    lineChart.xAxis.labelCount = dates.size
                    lineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM

                    val legend = lineChart.legend
                    legend.isEnabled = true
                    legend.textSize = 12f
                    legend.formSize = 12f
                    legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
                    legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
                    legend.orientation = Legend.LegendOrientation.HORIZONTAL
                    legend.setDrawInside(false)

                    lineChart.description.isEnabled = false

                    lineChart.invalidate()
                } else {
                    lineChart.clear()
                    lineChart.invalidate()
                }
            }
        }
    }
}