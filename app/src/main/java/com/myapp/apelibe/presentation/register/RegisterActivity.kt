package com.myapp.apelibe.presentation.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.apelibe.R
import com.myapp.apelibe.databinding.ActivityRegisterBinding
import org.jetbrains.anko.toast

class RegisterActivity : AppCompatActivity() {

    private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(registerBinding.root)

        onAction()
    }

    private fun onAction() {
        registerBinding.apply {
            btnCloseRegister.setOnClickListener {
                finish()
            }

            btnRegister.setOnClickListener {
                toast("Register Succes")
            }
        }
    }
}