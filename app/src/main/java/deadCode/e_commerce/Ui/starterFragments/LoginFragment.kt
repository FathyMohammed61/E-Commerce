package deadCode.e_commerce.Ui.starterFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import deadCode.e_commerce.R
import deadCode.e_commerce.Ui.VisualSearchFragment
import deadCode.e_commerce.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater)
        collectMethods()
        return binding.root
    }

    override fun getViewLifecycleOwner(): LifecycleOwner {
        return super.getViewLifecycleOwner()
    }


    fun collectMethods() {
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


    private fun btnLogin() {
        binding.apply {

            btnLogin.setOnClickListener {
                parentFragmentManager.beginTransaction().apply {
                    replace(R.id.flMainFragment, VisualSearchFragment())
                        .addToBackStack("replacement")
                        .commit()
                }
            }
        }
    }

}