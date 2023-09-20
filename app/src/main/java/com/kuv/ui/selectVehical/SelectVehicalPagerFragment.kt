package com.kuv.app.android.ui.selectVehical

import OnbordingPagerAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.kuv.R


import com.kuv.app.android.ui.onbording.OnBoardingPageFirst



class SelectVehicalPagerFragment : Fragment() {
    private var viewPagerAdapter: OnbordingPagerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view =  inflater.inflate(R.layout.onboarding_parent_fragment, container, false)
        viewPagerAdapter = OnbordingPagerAdapter(requireActivity().supportFragmentManager)
        val viewpager = view.findViewById<ViewPager>(R.id.viewpager)
        viewpager.adapter =viewPagerAdapter
        viewPagerAdapter!!.add(OnBoardingPageFirst(), "Page 1")
        viewPagerAdapter!!.add(OnBoardingPageFirst(), "Page 2")
        viewPagerAdapter!!.add(OnBoardingPageFirst(), "Page 3")

        // Set the adapter

        // Set the adapter
        viewpager.setAdapter(viewPagerAdapter)
        return view
    }


}