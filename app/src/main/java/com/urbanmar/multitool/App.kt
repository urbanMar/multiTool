package com.urbanmar.multitool

import android.app.Activity
import android.app.Application
import com.urbanmar.multitool.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject



/**
 * Created by b3stia on 07/01/2018.
 */
class App : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

    override fun onCreate() {
        super.onCreate()
        with(DaggerAppComponent.builder()) {
            application(this@App)
            build()
        }.also {
            it.inject(this)
        }

    }

}