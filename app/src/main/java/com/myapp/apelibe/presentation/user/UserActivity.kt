package com.myapp.apelibe.presentation.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.ACTION_LOCALE_SETTINGS
import com.myapp.apelibe.R
import com.myapp.apelibe.databinding.ActivityUserBinding
import com.myapp.apelibe.presentation.changepassword.ChangePasswordActivity
import com.myapp.apelibe.presentation.login.LoginActivity
import com.myapp.apelibe.presentation.main.MainActivity
import org.jetbrains.anko.startActivity

class UserActivity : AppCompatActivity() {

    private lateinit var userBinding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userBinding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(userBinding.root)

        onAction()
    }

    private fun onAction() {
        userBinding.apply {
            btnCloseUser.setOnClickListener {
                startActivity<MainActivity>() //Add New
                finish()
            }

            btnChangeLanguageUser.setOnClickListener {
                startActivity(Intent(ACTION_LOCALE_SETTINGS))
            }

            btnChangePasswordUser.setOnClickListener {
                startActivity<ChangePasswordActivity>()
            }

            btnLogoutUser.setOnClickListener {
                startActivity<LoginActivity>()
                finishAffinity()
            }
        }
    }
}