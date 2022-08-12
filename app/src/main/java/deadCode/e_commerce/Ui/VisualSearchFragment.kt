@file:Suppress("DEPRECATION")

package deadCode.e_commerce.Ui


import android.app.Activity.RESULT_OK
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import deadCode.e_commerce.databinding.FragmentVisualSearchBinding

class VisualSearchFragment : Fragment() {

 private   lateinit var binding: FragmentVisualSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVisualSearchBinding.inflate(inflater)
        upLoadPhoto()
        takePhoto()
        return binding.root
    }

    //-------------------------upLoadPhoto------------------//
    private fun upLoadPhoto() {
        binding.btnUploadImage.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                startActivityForResult(it, 0)
            }
        }
    }

    //----------------------------takePhoto---------------------------------//

    private fun takePhoto() {
        binding.btnTakeAPhoto.setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
                startActivityForResult(it, 1)

            }
        }

    }

    //----------------------------onActivityResult--------------------------------///

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 0 && resultCode == RESULT_OK) {
            val uri = data?.data
        }

        if (requestCode == 1 && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap

        }
    }

}