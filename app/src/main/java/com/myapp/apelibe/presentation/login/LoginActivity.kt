package com.myapp.apelibe.presentation.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AlertDialog
import com.myapp.apelibe.R
import com.myapp.apelibe.databinding.ActivityLoginBinding
import com.myapp.apelibe.presentation.forgotpassword.ForgotPasswordActivity
import com.myapp.apelibe.presentation.main.MainActivity
import com.myapp.apelibe.presentation.register.RegisterActivity
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        onAction()
    }

    private fun onAction() {
        loginBinding.apply {
            btnLogin.setOnClickListener {
                startActivity<MainActivity>()
            }

            btnRegister.setOnClickListener {
                startActivity<RegisterActivity>()
            }

            btnForgotPassLogin.setOnClickListener {
                startActivity<ForgotPasswordActivity>()
            }
        }
    }
}