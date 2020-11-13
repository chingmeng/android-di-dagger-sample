package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.settings.SettingsComponent
import dagger.Module

// This module tells AppComponent which are its subcomponents
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class, SettingsComponent::class])
class AppSubcomponents