package com.marleyspoon.daggertest.di

import android.app.Application
import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class AppApplication : Application() {

    lateinit var appComponent: AppComponent

    @Inject
    @Named("TAG1")
    lateinit var tag: String

//    @Inject
//    @Named("TAG2")
//    lateinit var tag2: String
//
//    @Inject
//    @Named("TAG3")
//    lateinit var tag3: String

    @Inject
    lateinit var map: Map<String, String>

    override fun onCreate() {
        super.onCreate()
        initDagger2()
        inject()
        printTag()
    }

    private fun initDagger2() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    private fun inject() {
        appComponent.inject(this)
    }

    private fun printTag() {
        Log.d("TAG", "message ${map.size} $tag")
    }
}