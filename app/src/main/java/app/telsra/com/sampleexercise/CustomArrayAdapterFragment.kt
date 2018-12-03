package app.telsra.com.sampleexercise


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_custom_array_adapter.*


/**
 * A simple [Fragment] subclass.
 */
class CustomArrayAdapterFragment : Fragment() {

    var items = arrayOf<String>("lorem", "ipsum", "dolor", "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel", "erat", "placerat", "ante", "porttitor", "sodales", "pellentesque", "augue", "purus")

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_custom_array_adapter, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        customArrayAdapterListView.adapter = IconicAdapter()
    }

    inner class IconicAdapter : ArrayAdapter<String>(this@CustomArrayAdapterFragment.activity, R.layout.custom_array_adapter_row, R.id.bigtext, items) {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var row = super.getView(position, convertView, parent)

            var sampleImageView = row.findViewById<ImageView>(R.id.sampelImage)

            if (items[position].length > 4) sampleImageView.setImageResource(R.drawable.ok) else sampleImageView.setImageResource(R.drawable.delete)

            var smallTextView = row.findViewById<TextView>(R.id.smallText)
            smallTextView.text = String.format(getString(R.string.size_template), items[position].length)

            return row
        }
    }

}// Required empty public constructor
