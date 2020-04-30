package com.marleyspoon.daggertest.di

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import com.marleyspoon.daggertest.di.scope.ControllerScope
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ControllerModule(private val mActivity: AppCompatActivity) {

    @Provides
    @ControllerScope
    fun activity(): Activity {
        return mActivity
    }

    @Provides
    @Named("TAG2")
    fun provideTag(): String = "this is tag2"
}