package com.example.bornagainshelf.views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bornagainshelf.R
import com.example.bornagainshelf.mocks.Mocks
import com.example.bornagainshelf.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initiate Mock User Data
        Mocks.init_user_data()

        img_fav_books.setOnClickListener  { showFavBooksActivity() }
        txt_fave_books.setOnClickListener { showFavBooksActivity() }

    }

    fun showFavBooksActivity() {
        val intent = Intent(this, FavBooksActivity::class.java)

        startActivity(intent)
    }
}
