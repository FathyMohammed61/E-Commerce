package deadCode.e_commerce.Ui.starterFragments


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import deadCode.e_commerce.R
import deadCode.e_commerce.Ui.VisualSearchFragment
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


    //----------------------------isPasswordValid----------------------------//
    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8 || text == null
    }

    ////--------------------------naveToLogin----------------------------///
    private fun naveToLogin() {

        val sharedPref = this.activity?.getSharedPreferences("sharedPref", 0)
        val editor = sharedPref?.edit()
        var isSeen = false
        binding.apply {
            btnSignUp.setOnClickListener {
                if (!isPasswordValid(IdPasswordSignup.text)) {
                    IdPasswordSignup.error = getString(R.string.error_password)
                } else if (!isSeen) {
                    editor?.apply {
                        putString(IdEmailSignup.text.toString(), null)
                        putString(IdPasswordSignup.text.toString(), null)
                        putString(IdNameSignup.text.toString(), null)
                        apply()
                    }
                    parentFragmentManager.beginTransaction().apply {
                        replace(R.id.flMainFragment, VisualSearchFragment())
                            .commit()
                    }
                } else {
                    IdPasswordSignup.error = null
                    IdEmailSignup.error = null
                }
            }
        }


    }


    private fun joinWithFaceBook() {
        binding.apply {
            fcSignUp.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
                startActivity(intent)
            }
        }
    }

}