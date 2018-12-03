package app.telsra.com.sampleexercise


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.sample_grid.*


/**
 * A simple [Fragment] subclass.
 */
class GridViewFragment : Fragment() {

    var items = arrayOf<String>("lorem", "ipsum", "dolor", "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel", "erat", "placerat", "ante", "porttitor", "sodales", "pellentesque", "augue", "purus")

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_grid_view, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sample_adapter = ArrayAdapter<String>(activity, R.layout.cell, items)
        sample_grid.adapter = sample_adapter

        sample_grid.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(context, "" + items[p2], Toast.LENGTH_LONG).show()
            }
        })

    }

}// Required empty public constructor
