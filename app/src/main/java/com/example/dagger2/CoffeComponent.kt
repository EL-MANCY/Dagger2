package com.example.dagger2

import dagger.Component

@Component
interface CoffeComponent {
    fun getCoffe():Coffe

    fun inject(mainActivity: MainActivity)
}