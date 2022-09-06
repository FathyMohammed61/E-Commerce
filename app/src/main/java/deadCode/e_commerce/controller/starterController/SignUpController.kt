package deadCode.e_commerce.controller.starterController

import android.text.Editable

class SignUpController {


    //----------------------------isPasswordValid----------------------------//
      fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8 || text == null
    }

}