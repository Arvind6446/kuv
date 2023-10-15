package com.kuv.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kuv.AddCarLayout
import com.kuv.DashHomeActivity
import com.kuv.DiagnosticLayout
import com.kuv.FuelActivity
import com.kuv.R
import com.kuv.RecordActivity
import com.kuv.app.android.ConnectBlue
import com.kuv.databinding.FragmentHomeBinding
import com.kuv.ui.home.adapter.HomeAdapter
import com.kuv.ui.home.model.QuickItemModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    lateinit var homerecycler: RecyclerView
    lateinit var homeAdapter: HomeAdapter
    lateinit var imagesList: ArrayList<QuickItemModel>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        // on below line we are initializing our list
        imagesList = ArrayList()
        imagesList.add(QuickItemModel("Dashboard",R.drawable.dashboard,0))
        imagesList.add(QuickItemModel("Monitoring",R.drawable.monitoring,1))
        imagesList.add(QuickItemModel("Diagnostics",R.drawable.car,2))
        imagesList.add(QuickItemModel("Fuel",R.drawable.fuel,3))
        imagesList.add(QuickItemModel("Drive Records",R.drawable.drive_records,4))
        imagesList.add(QuickItemModel("Drive Log",R.drawable.drive_log,5))
        imagesList.add(QuickItemModel("Manufacturer",R.drawable.manufacturer,6))
        imagesList.add(QuickItemModel("Engine",R.drawable.engine,7))


        val layoutManager = GridLayoutManager(context, 4)

        binding.quickItems.layoutManager = layoutManager

        homeAdapter = context?.let { HomeAdapter(imagesList, it) }!!

        binding.quickItems.adapter = homeAdapter

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