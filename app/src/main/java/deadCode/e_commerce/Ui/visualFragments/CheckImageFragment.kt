package deadCode.e_commerce.Ui.visualFragments

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




}