package com.kuv.ui.monitoring.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

import com.google.android.material.tabs.TabLayout
import com.kuv.R
import com.kuv.ui.monitoring.adapter.ViewPagerAdapter
import com.kuv.ui.monitoring.ui.individual.IndividualFragment
import com.kuv.ui.monitoring.ui.integrated.IntegratedFragment
import com.kuv.ui.monitoring.ui.standard.StandardFragment


class MonitoringActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.monitoring_layout)

        viewPager = findViewById(R.id.pager)
        tabLayout = findViewById(R.id.tab_layout)
        setAdapters()

    }

    private fun setAdapters() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(StandardFragment(), "Standard data")
        adapter.addFragment(IndividualFragment(), "Individual graph")
        adapter.addFragment(IntegratedFragment(), "Integrated graph")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}