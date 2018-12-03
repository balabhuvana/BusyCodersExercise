package app.telsra.com.sampleexercise


import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_auto_complete_text_view.*


/**
 * A simple [Fragment] subclass.
 */
class AutoCompleteTextViewFragment : Fragment() {

    var items = arrayOf<String>("lorem", "ipsum", "dolor", "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel", "erat", "placerat", "ante", "porttitor", "sodales", "pellentesque", "augue", "purus")

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_auto_complete_text_view, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        myAutoCompleteTextView.setAdapter(ArrayAdapter<String>(activity, android.R.layout.simple_dropdown_item_1line, items))
        myAutoCompleteTextView.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                selectionTextView.setText(p0.toString())
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })
    }

}// Required empty public constructor
