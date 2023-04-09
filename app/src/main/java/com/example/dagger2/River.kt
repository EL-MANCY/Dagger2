package com.example.dagger2

import android.util.Log
import javax.inject.Inject


//As it was for view only
class River  {

    constructor(){
        Log.i("MAINMAIN","water")
    }
    fun getWater():String = "water"
}