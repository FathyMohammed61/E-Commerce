package deadCode.e_commerce.model.data

import deadCode.e_commerce.model.ComData.CheckUserAndPassword

object DataBase {

    fun getCurrentUser(): CheckUserAndPassword {
        return CheckUserAndPassword("fathemahde561@gmail.com", "qwer1234@@")
    }

}