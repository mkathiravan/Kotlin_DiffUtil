package net.kathir.diffutilkotlin

import androidx.recyclerview.widget.DiffUtil

class PlayerDiffCallback(private val oldList: List<Player>, private val newList: List<Player>) : DiffUtil.Callback()
{

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size


    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

        return oldList[oldItemPosition].name == newList[newItemPosition].name
    }


    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

}
