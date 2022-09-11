package deadCode.e_commerce.Ui.starterFragments


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import deadCode.e_commerce.R
import deadCode.e_commerce.controller.starterController.SignUpController
import deadCode.e_commerce.databinding.FragmentSignUpBinding
import deadCode.e_commerce.Ui.mainPagesFragments.MainPagesFragment


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    private val signUpController = SignUpController()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(inflater)
        naveToLogin()
        intentToLogin()
        joinWithFaceBook()
        return binding.root
    }

    ////---------------------------------intentToLogin----------------------------////
    private fun intentToLogin() {
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
                if (!signUpController.isPasswordValid(IdPasswordSignup.text)) {
                    IdPasswordSignup.error = getString(R.string.error_password)
                    Toast.makeText(activity, "Please check your password", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    IdPasswordSignup.error = null
                    parentFragmentManager.beginTransaction().apply {
                        replace(R.id.flMainFragment, MainPagesFragment())
                        commit()
                    }
                }
            }
        }
    }

    /// joinWithFaceBook////
    private fun joinWithFaceBook() {
        binding.apply {
            fcSignUp.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
                startActivity(intent)
            }
        }
    }

}