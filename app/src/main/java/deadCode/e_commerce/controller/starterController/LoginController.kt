package deadCode.e_commerce.controller.starterController

import deadCode.e_commerce.model.data.DataBase

class LoginController {

    fun checkLoginEmail(email: String, password: String): Int {
        return if (email == DataBase.getCurrentUser().userName && password == DataBase.getCurrentUser().password || password.length < 8) 1 else 0
    }


}