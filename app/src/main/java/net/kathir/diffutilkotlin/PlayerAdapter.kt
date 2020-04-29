package net.kathir.diffutilkotlin;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class PlayerAdapter(intiPlayerList: List<Player>) : RecyclerView.Adapter<PlayerAdapter.ViewHolder>()

{
    private val players = mutableListOf<Player>()

    init {
        players.addAll(intiPlayerList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_player, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = players.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(actor = players[position])
    }


    fun swap(players:List<Player>)
    {
        val diffCallback = PlayerDiffCallback(this.players,players)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        this.players.clear()
        this.players.addAll(players)
        diffResult.dispatchUpdatesTo(this)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        private val name: TextView = itemView.findViewById(R.id.actor_name)

        fun bind(actor: Player) {
            name.text = actor.name
        }
    }


}
