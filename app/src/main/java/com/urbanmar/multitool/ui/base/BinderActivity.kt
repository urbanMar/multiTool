package com.urbanmar.multitool.ui.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import javax.inject.Inject

/**
 * Created by b3stia on 07/01/2018.
 */
abstract class BinderActivity<VB : ViewDataBinding, VM : ViewModel> : BaseActivity() {
    @Inject protected lateinit var vmFactory: ViewModelProvider.Factory
    protected lateinit var viewModel: VM
    protected lateinit var binding: VB

    abstract fun getModelClass(): Class<VM>
    abstract fun initBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, vmFactory).get(getModelClass())
        binding = initBinding()
    }
}