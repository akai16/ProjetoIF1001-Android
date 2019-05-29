package com.example.bornagainshelf.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.bornagainshelf.R
import com.example.bornagainshelf.models.Book
import com.example.bornagainshelf.views.BookDetailsActivity
import kotlinx.android.synthetic.main.recycler_fav_book_cell.view.*

class FavBookAdapter(val lista: List<Book>, val ctx: Context): RecyclerView.Adapter<FavBookAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavBookAdapter.ViewHolder {

        val view = LayoutInflater.from(ctx).inflate(R.layout.recycler_fav_book_cell, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = lista.count()

    override fun onBindViewHolder(holder: FavBookAdapter.ViewHolder, position: Int) {

        val book = lista[position]

        holder.title?.text  = book.title
        holder.author?.text = book.author.name
        holder.itemView?.setOnClickListener {
            val intent = Intent(ctx, BookDetailsActivity::class.java)

            ctx.startActivity(intent)
        }
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var title:  TextView? = view.txt_fav_book_title
        var author: TextView? = view.txt_fav_book_author
    }
}