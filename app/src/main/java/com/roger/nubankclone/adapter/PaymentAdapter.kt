package com.roger.nubankclone.adapter


import android.content.Intent
import com.roger.nubankclone.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.roger.nubankclone.PixAreaActivity

class PaymentAdapter(
    private val quantity: Int
): RecyclerView.Adapter<PaymentAdapter.PaymentViewHolder>() {
    class PaymentViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imgViewAreaPix = view.findViewById<View>(R.id.img_view_area_pix)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_payments, parent, false)
        return PaymentViewHolder(view)


    }

    override fun onBindViewHolder(
        holder: PaymentViewHolder,
        position: Int
    ) {

        holder.imgViewAreaPix.setOnClickListener {
            val intent = Intent(holder.itemView.context, PixAreaActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return quantity
    }
}
