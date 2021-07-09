package com.example.samplegraph

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColor
import androidx.core.view.marginRight
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.LineDataSet
import kotlin.reflect.typeOf

class SparkLineStyle(private  val context: Context) {

    fun styleChart(lineChart: LineChart) = lineChart.apply {

        axisRight.apply{
            isEnabled = false
        }



        axisLeft.apply {
            isEnabled = true
            axisMinimum = 0f
            axisMaximum = 150f
            granularity = 5f
            setDrawGridLines(true)
            gridColor = ContextCompat.getColor(context, R.color.whiteGraph)
            axisLineColor = ContextCompat.getColor(context, R.color.backGraph)
            textColor = ContextCompat.getColor(context, R.color.white)
            textSize = 10f
            xOffset = 16f
        }

        xAxis.apply {
            isEnabled = true
            axisMaximum = 12f
            isGranularityEnabled = true
            setDrawGridLines(false)
            setDrawAxisLine(false)
            position = XAxis.XAxisPosition.BOTTOM
            textColor = ContextCompat.getColor(context, R.color.white)
            textSize = 10f
            yOffset = 5f
        }


        setNoDataText("No data")
        setTouchEnabled(true)
        isDragEnabled = true
        setScaleEnabled(false)
        setPinchZoom(false)
        description = null
        legend.isEnabled = false
//        setDrawBorders(true)
//        setBorderColor(ContextCompat.getColor(context, R.color.whiteGraph))
//        setBorderWidth(2f)
    }

    fun styleLineDataSet(lineDataSet: LineDataSet) = lineDataSet.apply {
        color = ContextCompat.getColor(context, R.color.colorPrimary)
        valueTextColor = ContextCompat.getColor(context, R.color.white)
        valueTextSize = 12f
        setDrawValues(true)
        lineWidth = 2f
        isHighlightEnabled = true
        setDrawHighlightIndicators(false)
        circleRadius = 6f
        circleHoleRadius = 5f
        this.setCircleColor(ContextCompat.getColor(context, R.color.white))
        circleHoleColor = ContextCompat.getColor(context, R.color.colorPrimary)
        mode = LineDataSet.Mode.CUBIC_BEZIER

        setDrawFilled(true)
        fillDrawable = ContextCompat.getDrawable(context, R.drawable.gradient_graph)

    }
}