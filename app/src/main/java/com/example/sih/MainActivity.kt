package com.example.sih

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cardView1: CardView = findViewById(R.id.cvEmployee)
        val cardView2: CardView = findViewById(R.id.cvEmployer)


        cardView1.setOnClickListener {
            // Toggle background color
            if (cardView1.cardBackgroundColor.defaultColor == Color.WHITE) {
                cardView1.setCardBackgroundColor(getColor(R.color.cv_selected)) // Highlighted color
                cardView2.setCardBackgroundColor(Color.WHITE)
            }
//            } else {
//                cardView1.setCardBackgroundColor(Color.WHITE) // Default color
//            }
        }

        cardView2.setOnClickListener {
            // Toggle background color
            if (cardView2.cardBackgroundColor.defaultColor == Color.WHITE) {
                cardView2.setCardBackgroundColor(Color.LTGRAY) // Highlighted color
                cardView1.setCardBackgroundColor(Color.WHITE)
            }
//            } else {
//                cardView2.setCardBackgroundColor(Color.WHITE) // Default color
//            }
        }


    }
}