package com.marleyspoon.daggertest.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marleyspoon.daggertest.R
import com.marleyspoon.daggertest.di.AppApplication
import com.marleyspoon.daggertest.di.ControllerModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    @Named("TAG1")
    lateinit var tag: String

    @Inject
    @Named("TAG2")
    lateinit var tag2: String
//
//    @Inject
//    @Named("TAG3")
//    lateinit var tag3: String

    private val mControllerComponent by lazy {
        (application as AppApplication).appComponent
            .newControllerComponent(ControllerModule(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inject()
        initView()
    }

    private fun initView() {
        textview?.text = "$tag \n $tag2"
//        textview?.text = "$tag \n $tag2 \n $tag3"
    }

    private fun inject() {
        mControllerComponent.inject(this)
    }
}
