package com.urbanmar.multitool.ui.main

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.urbanmar.multitool.R
import com.urbanmar.multitool.databinding.ActivityMainBinding
import com.urbanmar.multitool.ui.base.BinderActivity

// https://github.com/savepopulation/price-tracker

class MainActivity : BinderActivity<ActivityMainBinding, MainActivityViewModel>() {

    override fun initBinding(): ActivityMainBinding = DataBindingUtil.setContentView(this, getLayoutRes())
    override fun getModelClass(): Class<MainActivityViewModel> = MainActivityViewModel::class.java
    override fun getLayoutRes(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, MainActivity::class.java)
    }
}
