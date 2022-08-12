package deadCode.e_commerce.Ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import deadCode.e_commerce.R
import deadCode.e_commerce.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater)
        forgetPassword()
        btnLogin()
        return binding.root
    }

    private fun forgetPassword() {
        binding.tvForgetPassword.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, ForgetPasswordFragment())
                    .addToBackStack("replacement")
                    .commit()
            }
        }
    }


    private fun btnLogin() {
        binding.btnLogin.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, VisualSearchFragment())
                    .addToBackStack("replacement")
                    .commit()
            }
        }
    }

}