package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var coffe: Coffe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CoffeComponent = DaggerCoffeComponent.create()
        component.inject(this)

        //Log.i("MAINMAIN",component.getCoffe().getCoffeeCup())
        Log.i("MAINMAIN", coffe.getCoffeeCup())


    }
}