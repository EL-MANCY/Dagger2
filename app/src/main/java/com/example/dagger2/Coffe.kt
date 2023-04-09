package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Coffe {
    @Inject
    lateinit var farm: Farm

    var river: River

    @Inject
    constructor( /*farm: Farm ,*/ river: River) {
//       this.farm = farm
         this.river = river
    }

    //CALLED WITHOUT CALLING IT IN THE MAIN  ACTIVITY
    @Inject
    fun connectElectricity(){
        Log.i("MAINMAIN","CONNECTING.....")
    }

    fun getCoffeeCup(): String = farm.getBeans() + " + " + river.getWater()
}