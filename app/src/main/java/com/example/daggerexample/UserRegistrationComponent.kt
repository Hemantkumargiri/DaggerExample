package com.example.daggerexample

import com.cheezycode.daggerexample.ActivityScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent


@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }
}