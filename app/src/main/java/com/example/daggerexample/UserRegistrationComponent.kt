package com.example.daggerexample

import dagger.Component


@Component
interface UserRegistrationComponent {

   /* fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService(): EmailService*/

    fun inject(mainActivity: MainActivity)
}