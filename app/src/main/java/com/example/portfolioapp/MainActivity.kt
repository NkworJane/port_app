package com.example.portfolioapp
//package `in`.eyehunt.androidactivitylifecyclekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickIcon.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://tutorial.eyehunts.com/")
            startActivity(intent)
        })

    }
    override fun onStart() {
        super.onStart()
        print( "The activity is in onStart state")
    }

    override fun onResume() {
        super.onResume()
        print( "The activity is in onResume state")
    }

    override fun onPause() {
        super.onPause()
        print( "The activity is in onPause state")
    }

    override fun onStop() {
        super.onStop()
        print( "The activity is in onStop state")
    }

    override fun onRestart() {
        super.onRestart()
       print("The activity is in onRestart state")
    }

    override fun onDestroy() {
        super.onDestroy()
       print("The activity is in onDestroy state")
    }
    fun print(msg: String){
        Log.d("Activity State ",msg)
    }

}
