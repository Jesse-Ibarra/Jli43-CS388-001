package com.codepath.bitlife

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.codepath.bitlife.data.DisplayWaterIntake
import java.io.Serializable
import java.text.SimpleDateFormat
import java.util.*

data class SerializableWaterIntake(
    val date: Long,
    val amount: Int
) : Serializable {
    fun toDisplayWaterIntake(): DisplayWaterIntake {
        return DisplayWaterIntake(Date(date), amount)
    }

    companion object {
        fun fromDisplayWaterIntake(displayWaterIntake: DisplayWaterIntake): SerializableWaterIntake {
            return SerializableWaterIntake(
                date = displayWaterIntake.date.time,
                amount = displayWaterIntake.amount
            )
        }
    }
}
class DetailActivity : AppCompatActivity() {
    private lateinit var dateTextView: TextView
    private lateinit var amountTextView: TextView
    private val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        dateTextView = findViewById(R.id.detailDate)
        amountTextView = findViewById(R.id.detailAmount)

        val serializableWaterIntake = intent.getSerializableExtra(WATER_INTAKE_EXTRA) as? SerializableWaterIntake
        val waterIntake = serializableWaterIntake?.toDisplayWaterIntake()

        waterIntake?.let {
            dateTextView.text = dateFormat.format(it.date)
            amountTextView.text = "${it.amount} ml"
        }
    }

    companion object {
        const val WATER_INTAKE_EXTRA = "WATER_INTAKE_EXTRA"
    }
}