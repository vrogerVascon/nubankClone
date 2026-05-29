package com.roger.nubankclone.service

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.roger.nubankclone.R

class ActivityBalance : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiy_balance)

        val cardSeparateBalance =
            findViewById<CardView>(R.id.card_view_separate_balance)
       cardSeparateBalance.setOnClickListener {
           Log.d("teste", "Separate balance")
        }


        val cardPaymentsAssistant = findViewById<CardView>(R.id.payments_assistant)
        cardPaymentsAssistant.setOnClickListener {
            Log.d("teste", "Payments assistant")
        }
    }

    }
