package com.manuel.continuatres

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.manuel.continuatres.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Desactivar el botón de inicio de sesión al inicio

        binding.tilEmail.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled=estadobtnLogin(text.toString(),binding.tilPassword.editText?.text.toString())
        }

        binding.tilPassword.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled=estadobtnLogin(binding.tilEmail.editText?.text.toString(),text.toString())
        }

        binding.btnLogin.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bienvenido!", Toast.LENGTH_SHORT).show()

        }
    }

    private fun estadobtnLogin(email: String, pass: String): Boolean {
        val isEmailValid = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && email=="ejemplo@idat.edu.pe"
        val isPasswordValid = pass.matches("-?\\d+(\\.\\d+)?".toRegex()) && pass.length>=6 && pass == "123456"

        return isEmailValid && isPasswordValid
    }

}