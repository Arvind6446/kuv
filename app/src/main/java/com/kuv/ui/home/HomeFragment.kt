package com.kuv.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kuv.AddCarLayout
import com.kuv.DashHomeActivity
import com.kuv.DiagnosticLayout
import com.kuv.FuelActivity
import com.kuv.RecordActivity
import com.kuv.app.android.ConnectBlue
import com.kuv.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.dashboard.root.setOnClickListener(View.OnClickListener {
            val i = Intent(activity, DashHomeActivity::class.java)
            startActivity(i)
        })


        binding.fuel.root.setOnClickListener(View.OnClickListener {
            val i = Intent(activity, FuelActivity::class.java)
            startActivity(i)
        })

        binding.drivingRecord.root.setOnClickListener(View.OnClickListener {
            val i = Intent(activity, RecordActivity::class.java)
            startActivity(i)
        })
        binding.diagnostic.root.setOnClickListener(View.OnClickListener {
            val i = Intent(activity, DiagnosticLayout::class.java)
            startActivity(i)
        })

        binding.addCar.root.setOnClickListener(View.OnClickListener {
            val i = Intent(activity, AddCarLayout::class.java)
            startActivity(i)
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}