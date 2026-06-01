package com.roger.nubankclone

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class PixAreaActivity: AppCompatActivity() {
    private lateinit var imgTransferPix: ImageView
    private lateinit var btnClose: Button
    private lateinit var inputLayoutPix: TextInputLayout
    private lateinit var editPix: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_pix)


        btnClose = findViewById(R.id.btn_close)
        btnClose.setOnClickListener {
            finish()
        }

        inputLayoutPix = findViewById(R.id.input_pix)
        editPix = findViewById(R.id.edit_pix)

        inputLayoutPix.setEndIconOnClickListener {
            val KeyPix = editPix.text.toString()
            Log.d("KeyPix", KeyPix)
        }

        imgTransferPix = findViewById(R.id.img_transfer_pix)
        imgTransferPix.setOnClickListener {
            val intent = Intent(this, TransferPixActivity::class.java)
            startActivity(intent)
        }
    }
    }