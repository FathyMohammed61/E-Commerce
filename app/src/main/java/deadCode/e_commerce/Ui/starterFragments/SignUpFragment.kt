package deadCode.e_commerce.Ui.starterFragments


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import deadCode.e_commerce.R
import deadCode.e_commerce.Ui.activities.MainPagesActivity
import deadCode.e_commerce.controller.starterController.SignUpController
import deadCode.e_commerce.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    private val signUpController = SignUpController()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(inflater)
        naveToLogin()
        intentToLoginByText()
        joinWithFaceBook()
        return binding.root
    }

    ////---------------------------------intentToLogin----------------------------////
    private fun intentToLoginByText() {
        binding.apply {
            tvHaveAnAccount.setOnClickListener {
                parentFragmentManager.beginTransaction().apply {
                    replace(R.id.flMainFragment, LoginFragment())
                        .addToBackStack("replacement")
                        .commit()
                }
            }
        }
    }

    ////--------------------------naveToLogin----------------------------///
    private fun naveToLogin() {
        binding.apply {
            btnSignUp.setOnClickListener {
                isEmailSuccess()
                isPasswordSuccess()
                isNameSuccess()
            }
        }
    }

    //// Intent From Here to MainPagesFragment()::class.java
    private fun naveToMainPages() {
        Intent(context, MainPagesActivity::class.java).apply {
            startActivity(this)
        }
    }

    /// joinWithFaceBook////
    private fun joinWithFaceBook() {
        binding.apply {
            fcSignUp.setOnClickListener {
                Toast.makeText(context, "We Work in it", Toast.LENGTH_SHORT).show()
            }
        }
    }

    //-------------------isPasswordSuccess---------------------//
    private fun isPasswordSuccess() {
        binding.apply {
            if (signUpController.isPasswordValid(IdPasswordSignup.text)) {
                IdPasswordSignup.error = getString(R.string.error_password)
                Toast.makeText(activity, "Please check your password", Toast.LENGTH_SHORT)
                    .show()
            } else {
                IdPasswordSignup.error = null
                naveToMainPages()
            }
        }
    }

    //------------------isEmailSuccess-------------------//
    private fun isEmailSuccess() {
        binding.apply {
            if (signUpController.isEmailEmpty(IdEmailSignup.text)) {
                IdEmailSignup.error = getString(R.string.error_mail)
                Toast.makeText(activity, "Please check your Email", Toast.LENGTH_SHORT)
                    .show()
            } else {
                IdEmailSignup.error = null
                naveToMainPages()
            }
        }

    }

    //----------------------isNameSuccess------------------//
    private fun isNameSuccess() {
        binding.apply {
            if (signUpController.isEmailEmpty(IdNameSignup.text)) {
                IdNameSignup.error = getString(R.string.errorName)
                Toast.makeText(activity, "Please check your Email", Toast.LENGTH_SHORT)
                    .show()
            } else {
                IdNameSignup.error = null
                naveToMainPages()
            }
        }

    }


}