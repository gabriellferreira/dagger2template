package com.marleyspoon.daggertest.service

import javax.inject.Inject

class PushMessagingService @Inject constructor() /*: FirebaseMessagingService()*/ {

//    @Inject
//    lateinit var appPreferences: AppPreferences
//
//    override fun onCreate() {
//        super.onCreate()
//        injectDI()
//    }
//
//    private fun injectDI() {
//        val mServiceComponent: ServiceComponent =
//            (application as AppApplication).applicationComponent
//                .newServiceComponent(ServiceModule())
//        mServiceComponent.inject(this)
//    }
//
//    override fun onNewToken(token: String) {
//        appPreferences.setFCMToken(token)
//    }
}