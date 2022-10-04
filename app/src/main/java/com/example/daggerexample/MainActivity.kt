package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        val userEmailService = component.getEmailService()
        userRegistrationService.registerUser("cheezycode@gmail.com","11111")
        userEmailService.send("abc","cheezycode@gmail.com","User Registered")
    }
}