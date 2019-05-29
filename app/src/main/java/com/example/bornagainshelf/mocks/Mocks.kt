package com.example.bornagainshelf.mocks

import com.example.bornagainshelf.models.Author
import com.example.bornagainshelf.models.Book
import com.example.bornagainshelf.models.User

object Mocks {

    val USER = User("capivara123", "CapivaraDesorientada")

    val AUTHOR_1 = Author("Robert Greene")
    val AUTHOR_2 = Author("Ernest Hemingway")


    // AUTHOR_1 Books
    val BOOK_1 = Book(AUTHOR_1, "The 48 Laws of Power")
    val BOOK_2 = Book(AUTHOR_1, "Mastery")


    // AUTHOR_2 Books
    val BOOK_3 = Book(AUTHOR_2, "The Old Man and The Sea")



    // User Data
    fun init_user_data() {
        USER.addFavBook(BOOK_1)
        USER.addFavBook(BOOK_3)
    }





}
