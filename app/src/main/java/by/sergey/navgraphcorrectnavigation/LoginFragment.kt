package by.sergey.navgraphcorrectnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.sergey.navgraphcorrectnavigation.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.myButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment3)
        }

        binding.myButton2.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_splashFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}