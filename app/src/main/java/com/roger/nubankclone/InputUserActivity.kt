package com.roger.nubankclone

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import java.text.NumberFormat
import java.util.Locale

class InputUserActivity: AppCompatActivity() {

    private lateinit var editUser: EditText
    private lateinit var editBalance: EditText
    private lateinit var btnConfirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_user)

        btnConfirm = findViewById(R.id.btn_confirm)
        editUser = findViewById(R.id.edit_user)
        editBalance = findViewById(R.id.edit_balance)


        editBalance.addTextChangedListener(object : TextWatcher {

            private var current = ""

            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence?,
                start: Int,
                before: Int,
                count: Int
            ) {
            }

            override fun afterTextChanged(s: Editable?) {

                if (s.toString() != current) {

                    editBalance.removeTextChangedListener(this)

                    val cleanString =
                        s.toString()
                            .replace("[R$,.\\s]".toRegex(), "")

                    val parsed =
                        cleanString.toDoubleOrNull() ?: 0.0

                    val formatted =
                        NumberFormat
                            .getCurrencyInstance(Locale("pt", "BR"))
                            .format(parsed / 100)

                    current = formatted

                    editBalance.setText(formatted)

                    editBalance.setSelection(formatted.length)

                    editBalance.addTextChangedListener(this)
                }
            }
        })

        btnConfirm.setOnClickListener {

            val shared =
                getSharedPreferences("nubank", MODE_PRIVATE)

            // Valores antigos salvos
            val oldUser =
                shared.getString("user", "Bem vindo")

            val oldBalance =
                shared.getString("balance", "R$ 0,00")

            // Novos valores digitados
            var user =
                editUser.text.toString()

            var balance =
                editBalance.text.toString()

            // Se estiver vazio, mantém o anterior
            if (user.isBlank()) {
                user = oldUser ?: "Bem vindo"
            }

            if (balance.isBlank()) {
                balance = oldBalance ?: "R$ 0,00"
            }

            // SALVANDO
            shared.edit {
                putString("user", user)
                putString("balance", balance)
            }

            // Retornando para MainActivity
            val intent = Intent()

            intent.putExtra("user", user)
            intent.putExtra("balance", balance)

            setResult(RESULT_OK, intent)

            finish()
        }


    }
}