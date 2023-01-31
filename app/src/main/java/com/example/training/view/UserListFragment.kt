package com.example.training.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.training.viewmodel.MainViewModel
import com.example.training.adapter.PersonAdapter
import com.example.training.R
import com.example.training.databinding.FragmentUserListBinding

class UserListFragment : Fragment() {
    private val mainVm by activityViewModels<MainViewModel>()
    private var _binding: FragmentUserListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentUserListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PersonAdapter(
            persons = mainVm.loadData(),
            onUserClick = { person ->
                mainVm.setPerson(person)
                findNavController().navigate(R.id.action_userListFragment_to_detailFragment)
            }
        )

        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.rv.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}