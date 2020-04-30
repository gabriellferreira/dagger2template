package com.marleyspoon.daggertest.di

import com.marleyspoon.daggertest.di.scope.ServiceScope
import com.marleyspoon.daggertest.service.PushMessagingService
import dagger.Subcomponent

@ServiceScope
@Subcomponent(modules = [ServiceModule::class])
interface ServiceComponent {
    fun inject(pushMessagingService: PushMessagingService)
}