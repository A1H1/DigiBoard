package com.devco.digiboard.di.module

import androidx.lifecycle.ViewModelProvider
import com.devco.digiboard.util.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}