package com.example.daggerexample

import dagger.Module
import dagger.Provides


@Module
class NotificationServiceModule
 {

    @Provides
    fun getMessageService() : NotificationService
    {
    return MessageService()
    }
 }