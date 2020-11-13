package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

// Definition of a Dagger component
@Component
interface AppComponent {

    // Define the classes that can be injected by this Component
    fun inject(activity: RegistrationActivity)
}