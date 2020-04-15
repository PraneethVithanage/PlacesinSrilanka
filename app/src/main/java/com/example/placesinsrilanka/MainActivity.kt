package com.example.placesinsrilanka

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var landmarkNames = ArrayList<String>()

        landmarkNames.add("Sigiriya")
        landmarkNames.add("Ella ")
        landmarkNames.add("Nuwara Eliya")
        landmarkNames.add("Pinnawala")
        landmarkNames.add("Polonnaruwa")
        landmarkNames.add("Adams Peak ")
        landmarkNames.add("Mirissa")
        landmarkNames.add("Yala ")
        landmarkNames.add("Colombo")
        landmarkNames.add("Jaffna")






        val sigiriya =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.sigiriya)
        val Ella = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.alla)
        val NuwaraEliya =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.nuwaraeliya)
        val Pinnawala =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.pinnawala)
        val Polonnaruwa =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.download)
        val AdamsPeak =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.adamspeak)
        val mirissa = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.mirissa)
        val Yala = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.yala)
        val Colombo = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.colombo)
        val Jaffna = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.jaffna)


        val larndmarkimages = ArrayList<Bitmap>()

        larndmarkimages.add(sigiriya)
        larndmarkimages.add(Ella)
        larndmarkimages.add(NuwaraEliya)
        larndmarkimages.add(Pinnawala)
        larndmarkimages.add(Polonnaruwa)
        larndmarkimages.add(AdamsPeak)
        larndmarkimages.add(mirissa)
        larndmarkimages.add(Yala)
        larndmarkimages.add(Colombo)
        larndmarkimages.add(Jaffna)

        var arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,landmarkNames)

             listviwe.adapter = arrayAdapter

         listviwe.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

             val intent = Intent(applicationContext,DetailActivity::class.java)
             intent.putExtra("Username",landmarkNames[position])

             var bitmap = larndmarkimages[position]

             var chosen = global.Chosen
             chosen.chosenimage = bitmap

             startActivity(intent)
         }



            }

        }





