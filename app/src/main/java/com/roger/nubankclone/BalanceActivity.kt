package com.roger.nubankclone

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class BalanceActivity : AppCompatActivity() {

    private lateinit var btnArrowLeft: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiy_balance)


        btnArrowLeft = findViewById(R.id.btn_arrow_left)
        btnArrowLeft.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

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