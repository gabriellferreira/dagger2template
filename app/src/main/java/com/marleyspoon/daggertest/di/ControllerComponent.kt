package com.marleyspoon.daggertest.di

import com.marleyspoon.daggertest.di.scope.ControllerScope
import com.marleyspoon.daggertest.view.MainActivity
import dagger.Subcomponent

@ControllerScope
@Subcomponent(modules = [ControllerModule::class, ViewModelModule::class])
interface ControllerComponent {

    // View
    fun inject(activity: MainActivity)
}