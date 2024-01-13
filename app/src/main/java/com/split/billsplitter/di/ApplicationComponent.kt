package com.split.billsplitter.di

import com.split.billsplitter.di.module.ApplicationModule
import com.split.billsplitter.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [ApplicationModule::class, NetworkModule::class]
)
interface ApplicationComponent {
}