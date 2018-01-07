package com.urbanmar.multitool.di.component

import android.app.Application
import com.urbanmar.multitool.App
import com.urbanmar.multitool.di.builder.ActivityBuilder
import com.urbanmar.multitool.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by b3stia on 07/01/2018.
 */
@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuilder::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}