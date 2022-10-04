package com.example.daggerexample

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface NotificationService
{
    fun send(to:String,from:String,body:String?)

}

class EmailService @Inject constructor() :NotificationService
{
    override fun send(to:String, from:String, body:String?)
    {
        Log.d(TAG, "Email sent")
    }
}

class MessageService : NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Message sent")
    }

}
