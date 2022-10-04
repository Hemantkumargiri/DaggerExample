package com.example.daggerexample

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email:String,password:String){
        Log.d(TAG, "User saved in DB")
    }
}