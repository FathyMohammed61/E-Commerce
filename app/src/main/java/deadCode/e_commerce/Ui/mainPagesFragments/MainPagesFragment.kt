package deadCode.e_commerce.Ui.mainPagesFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import deadCode.e_commerce.databinding.FragmentMainPagesBinding

class MainPagesFragment : Fragment() {
    private lateinit var binding: FragmentMainPagesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainPagesBinding.inflate(inflater)
        return binding.root
    }

}