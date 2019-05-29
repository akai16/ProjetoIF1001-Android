package com.example.bornagainshelf.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.bornagainshelf.R
import com.example.bornagainshelf.adapters.FavBookAdapter
import com.example.bornagainshelf.mocks.Mocks
import kotlinx.android.synthetic.main.activity_fav_books.*

class FavBooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fav_books)

        val favBookList = Mocks.USER.getFavBooks()

        recycler_fav_books.adapter = FavBookAdapter(favBookList,this)
        recycler_fav_books.layoutManager = LinearLayoutManager(this)
    }
}
