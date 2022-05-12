package com.vishnevskiypro.recyclerviewanrush

import android.app.Application
import com.vishnevskiypro.recyclerviewanrush.model.UsersService

class App: Application() {

    val usersService = UsersService()
}