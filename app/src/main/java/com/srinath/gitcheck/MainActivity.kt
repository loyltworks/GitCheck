package com.srinath.gitcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("jkffldlfl","Commit 1")
        Log.d("jkffldlfl","Changes after revert commit")
    }
}