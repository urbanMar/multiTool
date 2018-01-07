package com.urbanmar.multitool.di.module

import android.app.Application
import android.content.Context
import com.urbanmar.multitool.App
import dagger.Module
import javax.inject.Singleton
import dagger.Provides



/**
 * Created by b3stia on 07/01/2018.
 */
@Module(includes = arrayOf(ViewModelModule::class))
class AppModule {
    @Provides
    @Singleton
    fun provideApplicationContext(app: App) = app.applicationContext
}