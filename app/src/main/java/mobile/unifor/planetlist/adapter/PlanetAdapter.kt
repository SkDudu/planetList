package mobile.unifor.planetlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mobile.unifor.planetlist.R
import mobile.unifor.planetlist.interfaces.PlanetItemListener
import mobile.unifor.planetlist.model.Planets
import mobile.unifor.planetlist.repository.PlanetRepository

class PlanetAdapter(val list: List<Planets>):
    RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    private var listener:PlanetItemListener? = null

    fun setOnPlanetItemCLickListener(listener: PlanetItemListener){
        this.listener = listener
    }

    class PlanetViewHolder(view: View, listener: PlanetItemListener?):RecyclerView.ViewHolder(view){
        val foto:ImageView = itemView.findViewById(R.id.imageView_listitem)
        val name:TextView = view.findViewById(R.id.planetlist_textView_name)

        init {
            view.setOnClickListener { view ->
                listener?.onUserItemCLick(view, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planet_list_item, parent, false)
        return PlanetViewHolder(view, listener)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        //holder.foto.setImageResource(list[position].picture)
        holder.name.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }


}