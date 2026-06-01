package com.roger.nubankclone

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class TransferPixActivity: AppCompatActivity() {
    private lateinit var btnArrowLeft: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer_pix)


        btnArrowLeft = findViewById(R.id.btn_close_transfer_pix)
        btnArrowLeft.setOnClickListener {
           finish()
        }
    }

    }