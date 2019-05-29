package com.example.bornagainshelf.models

class Author (val name: String) {

    private var books: ArrayList<Book> = ArrayList<Book>()

    fun addBook(book: Book) {
        this.books.add(book)
    }

}