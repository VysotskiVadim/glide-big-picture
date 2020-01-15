package dev.vadzimv.bigpicture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

private const val SMALL_IMAGE_URL = "https://www.notebookcheck.net/fileadmin/Notebooks/News/_nc3/android_wallpaper5_2560x1600_1.jpg"
private const val FIFTY_MEGABYTES_IMAGE_URL =
    "https://effigis.com/wp-content/themes/effigis_2014/img/GeoEye_GeoEye1_50cm_8bit_RGB_DRA_Mining_2009FEB14_8bits_sub_r_15.jpg"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Glide.with(this)
            .load(FIFTY_MEGABYTES_IMAGE_URL)
            .centerInside()
            .into(image)
    }
}