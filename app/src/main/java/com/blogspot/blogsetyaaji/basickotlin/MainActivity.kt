package com.blogspot.blogsetyaaji.basickotlin

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvmenu.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                0 -> Toast.makeText(this, "This is Toast using Kotlin", Toast.LENGTH_LONG).show()
                1 -> AlertDialog.Builder(this)
                        .setTitle("Judul")
                        .setMessage("Pesan")
                        .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                            Toast.makeText(this, "You pick yes button", Toast.LENGTH_LONG).show()
                        })
                        .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                            Toast.makeText(this, "You pick no button", Toast.LENGTH_LONG).show()
                        }
                        ).show()
                2 -> startActivity(Intent(this, InputUserActivity::class.java))
            }
        }
    }
}
