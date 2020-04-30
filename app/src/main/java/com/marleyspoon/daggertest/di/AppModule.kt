package com.marleyspoon.daggertest.di

import android.app.Application
import android.content.Context
import android.content.res.Resources
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AppModule(private val application: Application) {

    @Provides
    fun provideApplicationContext(): Context = application

    @Provides
    fun provideResources(context: Context): Resources = context.resources

    @Provides
    @Named("TAG1")
    fun provideTag(): String = "TAGTAGTAG1"

    @Provides
    fun provideInt(): Map<String, String> = mapOf(Pair("abc", "1234"))
}