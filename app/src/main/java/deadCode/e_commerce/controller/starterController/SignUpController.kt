package deadCode.e_commerce.controller.starterController

import android.text.Editable

class SignUpController {
    //----------------------------isPasswordValid----------------------------//
    fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8 || text == null
    }

    // ----------------------------isNameEmpty----------------------------//
    fun isNameEmpty(text: Editable?): Boolean {
        return text != null
    }

    // ----------------------------isEmailEmpty----------------------------//
    fun isEmailEmpty(text: Editable?): Boolean {
        return text != null
    }

}