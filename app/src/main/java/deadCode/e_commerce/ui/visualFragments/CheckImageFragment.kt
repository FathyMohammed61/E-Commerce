package deadCode.e_commerce.ui.visualFragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import deadCode.e_commerce.databinding.FragmentCheckImageBinding
import deadCode.e_commerce.model.ComData.comImage.imageRegister


class CheckImageFragment : Fragment() {

    private lateinit var binding: FragmentCheckImageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCheckImageBinding.inflate(inflater)
        return binding.root
    }

    fun getImage() {
        binding.apply {
            ivImage.setImageURI(imageRegister as Uri)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 0 && resultCode == AppCompatActivity.RESULT_OK) {
            binding.apply {
                val uri = data?.data
                ivImage.setImageURI(imageRegister as Uri)
            }


        }
    }

}