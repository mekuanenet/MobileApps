package com.miu.dinnerdecider

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var foodList = ArrayList<String>()
    //var foodList = listOf<String>("Hamburger, Pizza, Mexican, American, Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        foodList.add("Hamburger")
        foodList.add("Pizza")
        foodList.add("Mexican")
        foodList.add("Amrican")
        foodList.add("Chinese")
    }

    fun addFood(view: View) {
        var inputFood: String = editText.text.toString()
        if(inputFood != null)
        {
            foodList.add(inputFood)
        }

        textView5.text = inputFood
        editText.text?.clear();
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("New Food is added successfully!")
        alertDialogBuilder.show()
    }

    fun decide(view: View) {
        // generate random value
        var randomInteger = (0..foodList.count()-1).shuffled().first()
        textView5.text = foodList.get(randomInteger)
    }
}