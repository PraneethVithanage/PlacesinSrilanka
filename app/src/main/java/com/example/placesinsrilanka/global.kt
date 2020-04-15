package com.example.placesinsrilanka

import android.graphics.Bitmap

class  global{

    companion object Chosen{

        var chosenimage : Bitmap? =null
        fun retuneimage(): Bitmap{

            return chosenimage!!
        }
    }
}