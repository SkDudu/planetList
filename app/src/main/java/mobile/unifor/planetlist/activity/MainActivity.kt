package mobile.unifor.planetlist.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mobile.unifor.planetlist.R
import mobile.unifor.planetlist.adapter.PlanetAdapter
import mobile.unifor.planetlist.interfaces.PlanetItemListener
import mobile.unifor.planetlist.repository.PlanetRepository

class MainActivity : AppCompatActivity(), PlanetItemListener {

    private lateinit var mPlanetlist: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PlanetAdapter(PlanetRepository.findAll())

        mPlanetlist = findViewById(R.id.main_recyclerview_planetlist)
        mPlanetlist.layoutManager = LinearLayoutManager(this)
        mPlanetlist.adapter = adapter
        adapter.setOnPlanetItemCLickListener(this)
    }

    override fun onUserItemCLick(view: View, position: Int) {
        val it = Intent(this, DetailsActivity::class.java)
        it.putExtra("position", position)

        startActivity(it)
    }
}