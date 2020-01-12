package com.devco.digiboard.di.component

import android.app.Application
import com.devco.digiboard.DigiBoardApplication
import com.devco.digiboard.di.module.ActivityBindingModule
import com.devco.digiboard.di.module.ApplicationModule
import com.devco.digiboard.di.module.ContextModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class, ApplicationModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class])
interface ApplicationComponent : AndroidInjector<DaggerApplication> {
    fun inject(application: DigiBoardApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application?): Builder?

        fun build(): ApplicationComponent?
    }
}