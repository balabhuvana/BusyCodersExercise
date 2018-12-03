package app.telsra.com.sampleexercise

import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by bala on 3/12/18.
 */
class ViewHolder(var view: View?) {
    var sampleImageView: ImageView? = null
    var sampleTextView: TextView? = null

    init {
        sampleTextView = view?.findViewById<TextView>(R.id.smallText)
        sampleImageView = view?.findViewById(R.id.sampelImage)
    }
}