package com.devco.digiboard.di.module

import com.devco.digiboard.di.binding.AuthBindingModule
import com.devco.digiboard.ui.auth.AuthActivity
import com.devco.digiboard.ui.home.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [AuthBindingModule::class])
    abstract fun bindAuthActivity(): AuthActivity
}