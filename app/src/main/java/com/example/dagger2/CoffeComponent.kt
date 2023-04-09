package com.example.dagger2

import dagger.Component
import dagger.hilt.DefineComponent
import javax.inject.Singleton

@Component(modules = [CoffeeModule::class])
interface CoffeComponent {
    fun getCoffe():Coffe

    fun inject(mainActivity: MainActivity)
}