package com.example.dagger2

import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
class CoffeeModule {

    @Provides
    fun provideRiver():River = River()
}