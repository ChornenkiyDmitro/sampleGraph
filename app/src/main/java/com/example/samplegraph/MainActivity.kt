package com.example.samplegraph

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.github.mikephil.charting.listener.OnChartGestureListener
import com.github.mikephil.charting.listener.OnChartValueSelectedListener
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        chat.onChartGestureListener
//        chat.setOnChartValueSelectedListener(this)

        chat.isDragEnabled = true
        chat.setScaleEnabled(false)


        var values = arrayListOf<Entry>()
        values.add(Entry(0f, 60f))
        values.add(Entry(5f, 80f))
        values.add(Entry(9f, 10f))
        values.add(Entry(10f, 60f))
        values.add(Entry(24f, 40f))
        var set1 = LineDataSet(values, "data set 1")
        set1.fillAlpha = 110

        val dataSets = arrayListOf<ILineDataSet>()
        dataSets.add(set1)

        val data = LineData(dataSets)

        chat.data = data
    }
}