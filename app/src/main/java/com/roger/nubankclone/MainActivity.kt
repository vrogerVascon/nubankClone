package com.roger.nubankclone

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.roger.nubankclone.adapter.AdapterGiftCards
import com.roger.nubankclone.adapter.PaymentAdapter

class MainActivity : AppCompatActivity() {

    private var visibleBalance = true
    private lateinit var btnBalance: Button
    private lateinit var visibility: ImageView
    private lateinit var textBalance: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //-Payments, pix ..
        val recyclerPayments = findViewById<RecyclerView>(R.id.recycler_payments)
        recyclerPayments.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        recyclerPayments.adapter =
            PaymentAdapter(10)

        //Recycler gift cards
        val recyclerGiftCards = findViewById<RecyclerView>(R.id.recycler_gift_cards)
        recyclerGiftCards.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        recyclerGiftCards.adapter = AdapterGiftCards(10)

        //visibility show/hide

        visibility = findViewById<ImageView>(R.id.img_visibility)



        visibility.setOnClickListener {
            visibleBalance = !visibleBalance

            if(visibleBalance){
                visibility.setImageResource(R.drawable.ic_visibility_show)

            }else{
                visibility.setImageResource(R.drawable.ic_visibility_off)
                textBalance.textSize=18f
                textBalance.setTypeface(null, Typeface.BOLD)
                textBalance.text="R$ ••••••"
            }

        }

    }
}