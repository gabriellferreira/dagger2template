package com.marleyspoon.daggertest.di

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(appApplication: AppApplication)
    fun newControllerComponent(controllerModule: ControllerModule): ControllerComponent
    fun newServiceComponent(serviceModule: ServiceModule): ServiceComponent
}