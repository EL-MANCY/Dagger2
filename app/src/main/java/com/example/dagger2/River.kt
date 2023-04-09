package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class River  {

    @Inject
    constructor(){
        Log.i("MAINMAIN","water")
    }
    fun getWater():String = "water"
}