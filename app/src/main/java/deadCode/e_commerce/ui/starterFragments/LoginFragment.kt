package deadCode.e_commerce.ui.starterFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import deadCode.e_commerce.R
import deadCode.e_commerce.ui.visualFragments.VisualSearchFragment
import deadCode.e_commerce.controller.starterController.LoginController
import deadCode.e_commerce.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    private val loginController: LoginController = LoginController()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater)
        collectMethods()
        return binding.root
    }


    private fun collectMethods() {
        forgetPassword()
        btnLogin()

    }


    private fun forgetPassword() {
        binding.tvForgetPassword.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flMainFragment, ForgetPasswordFragment())
                    .addToBackStack("replacement")
                    .commit()
            }
        }
    }

    ///// check login ////
    private fun btnLogin() {
        binding.apply {
            btnLogin.setOnClickListener {
                if (loginController.checkLoginEmail(
                        IdEmailLogin.text.toString(),
                        IdPasswordLogin.text.toString()
                    ) == 1
                ) {
                    Toast.makeText(activity, "Enter your real mail", Toast.LENGTH_SHORT).show()
                    IdPasswordLogin.error = getString(R.string.error_password)
                } else {
                    IdPasswordLogin.error = null
                    parentFragmentManager.beginTransaction().apply {
                        replace(R.id.flMainFragment, VisualSearchFragment())
                            .commit()
                    }
                }
            }
        }
    }
}