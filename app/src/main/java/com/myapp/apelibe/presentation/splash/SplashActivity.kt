package com.myapp.apelibe.presentation.splash

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.myapp.apelibe.R
import com.myapp.apelibe.presentation.login.LoginActivity
import org.jetbrains.anko.startActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        delayAndGoToLogin()
    }

    private fun delayAndGoToLogin() {
        Handler(Looper.getMainLooper())
            .postDelayed({
                startActivity<LoginActivity>()
                finish()
            }, 1200)
    }
}