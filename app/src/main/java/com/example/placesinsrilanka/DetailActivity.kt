package com.example.placesinsrilanka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val profileName = intent.getStringExtra("Username")


        textView.setText(profileName)

        var chosen = global.Chosen
        var selectedimage = chosen.retuneimage()
        imageView.setImageBitmap(selectedimage)


        if (profileName == "Sigiriya" ){

            textView2.setText("Perhaps one of the most most beautiful natural places in Sri Lanka, get lost amongst the ancient remains, remarkable frescoes and water gardens at the astonishing Sigiriya Rock Fortress. Don’t miss the magnificent view from the top, with jungle and rolling hills in every direction." )
        }
        if (profileName == "Ella"){

            textView2.setText("Looking for the best places to visit in Sri Lanka? Get enamored by the stunning views through Ella Gap overlooking a spectacular gap in the southern mountain wall. Situated in the middle of beautiful countryside, with small vegetable plots, tea plantations on the hill slopes and forests on the tops this hill station is nothing less than breathtaking")
        }

        if (profileName == "Nuwara Eliya" ){

            textView2.setText("One of the most beautiful Sri Lanka tourist places, this 19th century hill station Nuwara Eliya retains its colonial ambiance with its golf course, gentlemen’s clubs and mock-Tudor buildings. It is one of the most beautiful locations in Sri Lanka for a scenic rail ride. Experience the stunning views of the surrounding tea plantations, waterfalls and dramatic mountains the train takes you from Kandy to Nuwara Eliya.")
        }

        if (profileName == "Pinnawala" ){

            textView2.setText("Can you imagine anything as heartwarming as staring at baby elephants as they enjoy a river soak?  The Pinnawalla Elephant Orphanage has many reasons to be called one of the beautiful places in Sri Lanka! It won’t be hard to believe if you wouldn’t want to leave this paradise.")
        }

        if (profileName == "Polonnaruwa" ){

            textView2.setText("The next place in the list is again a city that is popular for the temples and this has to be one of the best places to visit in Sri Lanka. You could easily spend your day imagining the ancient city life at the ruins of Polonnaruwa. Well preserved and full of archaeological treasures with hundreds of ancient structures like tombs and temples, statues and stupas it is difficult to not be amazed by the ruins here.")
        }

        if (profileName == "Adams Peak " ){

            textView2.setText("The next destination is one of the most mesmerizing Sri Lanka tourist places and is known as Adam’s peak. Adam’s peak is amongst the most beautiful places in Sri Lanka. Climb the slopes at night to watch a breathtaking sunrise at dawn that would be hard to forget.")
        }

        if (profileName == "Mirissa" ){

            textView2.setText("Spend your days, soaking in the sun on a hammock and whale-watching at the little village of Mirissa, one of the most appealing beach hideaways and places to see in Sri Lanka. The real world will be forgotten as soon as you enter this beachy paradise. Mirissa definitely has to be on your list of beautiful places to visit in Sri Lanka for an amazing holiday.")
        }

        if (profileName == "Yala "){

            textView2.setText("Get dazzled by the leopards at Yala National Park, home to one of the highest densities of leopard in the world. Full of grassy plains, forest, lagoons, and coastline, this National Park is no less than a big cat paradise. A complete package of natural beauty and heritage, Sri Lankan beautiful places will capture your heart and makes it one of the must visit places in Sri Lanka. ")
        }
        if (profileName == "Colombo" ){

            textView2.setText("Next place on the list is the city of Colombo that is certainly amongst the best places in Sri lanka. This will be completely unfair and your trip will not be complete if you do not visit the city of Colombo, which is the capital of Sri Lanka. There are several places in this city that you can visit and that will attract you definitely.")
        }

        if (profileName == "Jaffna" ){

            textView2.setText("Looking for religious tourist places in Sri Lanka?This place is also called the city of temples in Sri Lanka, as it has some of the most beautiful temples of Sri Lanka and one of the best Sri lanka attractions for spiritual retreat. The most visited temples of all in this place are the temple of Nallur Kovil.")
        }




    }
}
