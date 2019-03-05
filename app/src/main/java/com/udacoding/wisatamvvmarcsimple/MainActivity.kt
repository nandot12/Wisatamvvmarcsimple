package com.udacoding.wisatamvvmarcsimple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.udacoding.wisatamvvmarcsimple.ui.WisataFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.container,WisataFragment()).commit()
    }
}
