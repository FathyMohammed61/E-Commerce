package deadCode.e_commerce.ui.visualFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import deadCode.e_commerce.databinding.FragmentFindSimilerResultsBinding


class FindSimilarResultsFragment : Fragment() {

    lateinit var binding: FragmentFindSimilerResultsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFindSimilerResultsBinding.inflate(inflater)
        return binding.root
    }

}