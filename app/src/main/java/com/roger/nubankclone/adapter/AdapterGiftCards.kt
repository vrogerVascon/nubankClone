package com.roger.nubankclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.roger.nubankclone.R

class AdapterGiftCards(
    private val quantity: Int
) : RecyclerView.Adapter<AdapterGiftCards.GiftCardViewHolder>() {

    class GiftCardViewHolder(view: View)
        : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GiftCardViewHolder {

        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.gift_cards, parent, false)

        return GiftCardViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: GiftCardViewHolder,
        position: Int
    ) {

    }

    override fun getItemCount(): Int {

        return quantity

    }
}