package com.roger.nubankclone.service

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import com.roger.nubankclone.R

class AreaPix: AppCompatActivity() {
    private lateinit var inputLayoutPix: TextInputLayout
    private lateinit var editPix: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.area_pix)

        inputLayoutPix = findViewById(R.id.input_pix)
        editPix = findViewById(R.id.edit_pix)

        inputLayoutPix.setEndIconOnClickListener {
            val KeyPix = editPix.text.toString()
            Log.d("KeyPix", KeyPix)
        }
    }
    }
