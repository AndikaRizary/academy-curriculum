package com.example.hellomvvm8.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.hellomvvm8.R


// The server code is in Common/Restful/code/HelloRestful2/hello_cryptocurrency.py
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findNavController(R.id.nav_host).let { nav ->
            findViewById<Toolbar>(R.id.toolbar).setupWithNavController(nav, AppBarConfiguration(nav.graph))
        }
    }
}
