package com.urbanmar.multitool.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.urbanmar.multitool.di.key.ViewModelKey
import com.urbanmar.multitool.ui.main.MainActivityViewModel
import com.urbanmar.multitool.viewModel.VMFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by b3stia on 07/01/2018.
 */
@Module
internal abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainActivityViewModel): ViewModel

    @Binds abstract fun bindViewModelFactory(vmFactory: VMFactory): ViewModelProvider.Factory
}