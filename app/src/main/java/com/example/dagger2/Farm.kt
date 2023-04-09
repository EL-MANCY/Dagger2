package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Farm  {

    @Inject
    constructor(){
        Log.i("MAINMAIN","FARM")
    }

    fun getBeans():String = "Beans"

}