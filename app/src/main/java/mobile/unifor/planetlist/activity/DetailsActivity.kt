package mobile.unifor.planetlist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import mobile.unifor.planetlist.R
import mobile.unifor.planetlist.model.Planets
import mobile.unifor.planetlist.repository.PlanetRepository
import org.w3c.dom.Text

class DetailsActivity : AppCompatActivity() {

    private lateinit var mDetailName: TextView
    private lateinit var mDetailDiameter: TextView
    private lateinit var mDetailSunDistance: TextView
    private lateinit var mDetailDescription: TextView

    private var position = -1
    private lateinit var planets:List<Planets>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        position = intent.getIntExtra("position", -1)

        mDetailName = findViewById(R.id.detail_textview_name)
        mDetailDiameter = findViewById(R.id.detail_textview_diameter)
        mDetailSunDistance = findViewById(R.id.detail_textview_sundistance)
        mDetailDescription = findViewById(R.id.detail_textview_description)


    }

    override fun onStart() {
        super.onStart()
        planets = PlanetRepository.findAll()
    }

    override fun onResume() {
        super.onResume()

        mDetailName.text = planets[position].name
        mDetailDiameter.text = planets[position].diameter.toString()
        mDetailSunDistance.text = planets[position].distanceSun.toString()
        mDetailDescription.text = planets[position].aboutPlanet
    }
}