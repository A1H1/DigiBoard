package com.devco.digiboard

import com.devco.digiboard.di.component.ApplicationComponent
import com.devco.digiboard.di.component.DaggerApplicationComponent
import dagger.android.support.DaggerApplication

class DigiBoardApplication : DaggerApplication() {
    override fun applicationInjector(): ApplicationComponent? {
        val component: ApplicationComponent? =
            DaggerApplicationComponent.builder().application(this)?.build()
        component?.inject(this)

        return component
    }
}