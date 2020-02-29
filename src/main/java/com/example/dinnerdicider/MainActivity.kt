package com.example.dinnerdicider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonalds","Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = java.util.Random();
            val ranFood = random.nextInt(foodList.count());
            foodName.text = foodList[ranFood]
        }

        addFoodButton.setOnClickListener {
            val newFood = newFoodName.text.toString()
            foodList.add(newFood)
            newFoodName.text.clear()
            println(foodList)
        }
    }
}
