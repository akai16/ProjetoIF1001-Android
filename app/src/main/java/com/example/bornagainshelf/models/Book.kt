package com.example.bornagainshelf.models

class Book(val author: Author, val title: String) {

    init {
        author.addBook(this)
    }

    var description: String = ""
}