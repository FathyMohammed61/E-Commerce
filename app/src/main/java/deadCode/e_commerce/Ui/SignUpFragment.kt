package deadCode.e_commerce.Ui


import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import deadCode.e_commerce.R
import deadCode.e_commerce.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(inflater)
        naveToLogin()
        intentToLogin()
        return binding.root
    }


    ////---------------------------------intentToLogin----------------------------////
    private fun intentToLogin() {
        binding.tvHaveAnAccount.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flMainFragment, LoginFragment())
                    .addToBackStack("replacement")
                    .commit()
            }
        }
    }

    //----------------------------isPasswordValid----------------------------//
    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8 || text == null
    }

    ////--------------------------naveToLogin----------------------------///
    private fun naveToLogin() {
        binding.btnSignUp.setOnClickListener {
            if (!isPasswordValid(binding.IdPasswordSignup.text)) {
                binding.IdPasswordSignup.error = getString(R.string.error_password)
            } else {
                binding.IdPasswordSignup.error = null
                binding.IdEmailSignup.error = null
                parentFragmentManager.beginTransaction().apply {
                    replace(R.id.flMainFragment, LoginFragment())
                        .addToBackStack("replacement")
                        .commit()
                }
            }

        }

    }

}