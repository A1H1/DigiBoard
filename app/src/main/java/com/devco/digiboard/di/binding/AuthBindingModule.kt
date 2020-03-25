package com.devco.digiboard.di.binding

import com.devco.digiboard.ui.auth.LoginFragment
import com.devco.digiboard.ui.auth.OTPFragment
import com.devco.digiboard.ui.auth.WelcomeDetailsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthBindingModule {

    @ContributesAndroidInjector
    abstract fun bindLoginFragment(): LoginFragment

    @ContributesAndroidInjector
    abstract fun bindOTPFragment(): OTPFragment


    @ContributesAndroidInjector
    abstract fun bindWelcomeDetailsFragment(): WelcomeDetailsFragment


}