/*
 * Copyright (c) 2019 Manish Karena
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.manishkarena.kotlinbootcamp.lesson5.constants

class Book {

    companion object {
        const val BASE_URL = "https://www.bookstore.com/books/all/"
    }

    fun canBorrow(books: Int): Boolean {
        return books < BOOKS_BORROW_LIMIT
    }

    fun printUrl(bookTitle: String) {
        println("Book-URL :- ${BASE_URL.plus(bookTitle).plus(".html")}")
    }
}