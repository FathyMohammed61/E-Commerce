package deadCode.e_commerce.Ui.visualFragments


import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import deadCode.e_commerce.R
import deadCode.e_commerce.databinding.FragmentVisualSearchBinding
import deadCode.e_commerce.model.ComData.comImage.imageRegister

@Suppress("DEPRECATION")
open class VisualSearchFragment : Fragment() {

    private lateinit var binding: FragmentVisualSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVisualSearchBinding.inflate(inflater)
        upLoadPhoto()
        return binding.root
    }

    //-------------------------upLoadPhoto------------------//
    private fun upLoadPhoto() {
        binding.btnUploadImage.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "$imageRegister"
                parentFragmentManager.beginTransaction().apply {
                    replace(R.id.flMainFragment, CheckImageFragment())
                    commit()
                }
                startActivityForResult(it, 0)
            }
        }
    }


    //----------------------------onActivityResult--------------------------------///

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 0 && resultCode == RESULT_OK) {
            val uri = data?.data

        }
    }


}