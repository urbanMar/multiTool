package com.urbanmar.multitool.ui.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.urbanmar.multitool.R
import dagger.android.AndroidInjection

/**
 * Created by b3stia on 07/01/2018.
 */
abstract class BaseActivity : AppCompatActivity() {

    @LayoutRes abstract fun getLayoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    fun setScreenTitle(title: String?) {
        supportActionBar?.title = title ?: getString(R.string.app_name)
    }
}