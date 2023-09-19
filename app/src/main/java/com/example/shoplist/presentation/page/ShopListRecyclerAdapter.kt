package com.example.shoplist.presentation.page

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoplist.R
import com.example.shoplist.domain.ShopItem
import java.lang.RuntimeException

class ShopListRecyclerAdapter: RecyclerView.Adapter<ShopListRecyclerAdapter.ShopItemViewHolder>() {
    var onLongPress: ((ShopItem) -> Unit)? = null
    var shopList = listOf<ShopItem>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ShopItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.t_name)
        val count: TextView = itemView.findViewById(R.id.t_count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolder {
        val layout = when(viewType){
            ENABLED_ITEM -> R.layout.item_shop_enabled
            DISABLED_ITEM -> R.layout.item_shop_disabled
            else -> throw RuntimeException("unknown type")
        }

        return ShopItemViewHolder(LayoutInflater.from(parent.context).inflate(layout, parent, false))
    }

    override fun getItemCount(): Int {
        return shopList.size
    }

    override fun getItemViewType(position: Int): Int {
        val item = shopList[position]
        return if(item.enabled){
            ENABLED_ITEM
        } else {
            DISABLED_ITEM
        }

    }

    companion object{
        const val ENABLED_ITEM = 100
        const val DISABLED_ITEM = 101
    }


    override fun onBindViewHolder(holder: ShopItemViewHolder, position: Int) {
        val item = shopList[position]
        holder.name.text = item.name
        holder.count.text = item.count.toString()
        holder.itemView.setOnLongClickListener{
            onLongPress?.invoke(item)
            true
        }
    }
}