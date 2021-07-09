package com.example.samplegraph

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var styleChart: SparkLineStyle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        styleChart = SparkLineStyle(this)

        var chartPoints = mutableListOf<Entry>()
        chartPoints.add(Entry(0f, 60F))
        chartPoints.add(Entry(1f, 80f))
        chartPoints.add(Entry(2f, 10f))
        chartPoints.add(Entry(3f, 65f))
        chartPoints.add(Entry(4f, 70f))
        chartPoints.add(Entry(6f, 78f))
        chartPoints.add(Entry(8f, 50f))
        chartPoints.add(Entry(11f, 51f))
        chartPoints.add(Entry(11.7f, 40f))

        var set1 = LineDataSet(chartPoints, "")
        set1.fillAlpha = 110
        styleChart.styleLineDataSet(set1)

        val dataSets = mutableListOf<ILineDataSet>()
        dataSets.add(set1)

        val data =LineData(dataSets)

        chat.data = data

        styleChart.styleChart(chat)
    }


}