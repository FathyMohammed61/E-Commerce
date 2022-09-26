package deadCode.e_commerce.controller.starterController

import deadCode.e_commerce.model.data.DataBase.getCurrentUser

object LoginController {

    fun checkLoginEmail(email: String, password: String): Int {
        return if (email == getCurrentUser().userName && password == getCurrentUser().password || password.length < 8) 1 else 0
    }


}