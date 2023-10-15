package com.kuv.ui.home.adapter



import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kuv.AddCarLayout
import com.kuv.DashHomeActivity
import com.kuv.DiagnosticLayout
import com.kuv.FuelActivity
import com.kuv.R
import com.kuv.RecordActivity
import com.kuv.ui.home.model.QuickItemModel
import com.kuv.ui.monitoring.ui.MonitoringActivity

// on below line we are creating
// a course rv adapter class.
class HomeAdapter(
    // on below line we are passing variables
    // as course list and context
    private val imageList: ArrayList<QuickItemModel>,
    private val context: Context
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeAdapter.HomeViewHolder {
        // this method is use to inflate the layout file
        // which we have created for our recycler view.
        // on below line we are inflating our layout file.
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.quick_actions_item,
            parent, false
        )
        // at last we are returning our view holder
        // class with our item View File.
        return HomeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HomeAdapter.HomeViewHolder, position: Int) {
        // on below line we are setting data to our text view and our image view.
        holder.image.setImageResource(imageList.get(position).image)
        holder.title.setText(imageList.get(position).title)

        holder.image.setOnClickListener(View.OnClickListener {

            if(imageList.get(position).id ==0){
                val i = Intent(context, DashHomeActivity::class.java)
                context.startActivity(i)
            }

            if(imageList.get(position).id ==1){
                val i = Intent(context, MonitoringActivity::class.java)
                context.startActivity(i)
            }

            if(imageList.get(position).id ==3){
                val i = Intent(context, FuelActivity::class.java)
                context.startActivity(i)
            }

            if(imageList.get(position).id ==4){
                val i = Intent(context, RecordActivity::class.java)
                context.startActivity(i)
            }

            if(imageList.get(position).id ==2){
                val i = Intent(context, DiagnosticLayout::class.java)
                context.startActivity(i)
            }




        })
    }

    override fun getItemCount(): Int {
        // on below line we are
        // returning our size of our list
        return imageList.size
    }

    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // on below line we are initializing our course name text view and our image view.

        val image: ImageView = itemView.findViewById(R.id.image)
        val title: TextView = itemView.findViewById(R.id.title)
    }
}
