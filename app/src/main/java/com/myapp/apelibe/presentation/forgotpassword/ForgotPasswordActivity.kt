package com.myapp.apelibe.presentation.forgotpassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.apelibe.R
import com.myapp.apelibe.databinding.ActivityForgotPasswordBinding
import org.jetbrains.anko.toast

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var forgotPasswordBinding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        forgotPasswordBinding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(forgotPasswordBinding.root)

        onAction()
    }

    private fun onAction() {
        forgotPasswordBinding.apply {
            btnCloseForgotPassword.setOnClickListener { finish() }

            btnForgotPassword.setOnClickListener {
                toast("Forgot Password")
            }
        }
    }
}