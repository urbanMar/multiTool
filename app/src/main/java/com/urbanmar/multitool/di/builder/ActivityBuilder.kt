package com.urbanmar.multitool.di.builder

import com.urbanmar.multitool.di.scope.ActivityScope
import com.urbanmar.multitool.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by b3stia on 07/01/2018.
 */
@Module
internal abstract class ActivityBuilder {

    @ContributesAndroidInjector
    @ActivityScope
    abstract fun contributesMainActivity(): MainActivity
}