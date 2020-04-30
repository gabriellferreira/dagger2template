package com.marleyspoon.daggertest.di

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ServiceModule {

    @Provides
    @Named("TAG3")
    fun provideTag(): String = "this is not tag 3, just kidding, it is"
}