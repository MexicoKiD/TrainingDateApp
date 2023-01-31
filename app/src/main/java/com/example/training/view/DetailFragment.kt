package com.example.training.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.training.viewmodel.MainViewModel
import com.example.training.databinding.FragmentDetailBinding
import com.example.training.model.Person

class DetailFragment : Fragment() {
    private val mainVm by activityViewModels<MainViewModel>()
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindPersonData(mainVm.getPerson())
    }

    @SuppressLint("SetTextI18n")
    private fun bindPersonData(person: Person?) {
        person ?: return
        binding.imageView.setImageResource(person.image)
        binding.name.text = "${person.name} ${person.surname}"
        binding.hobby.text = person.hobby
        binding.birthDate.text = person.birthDate
        binding.city.text = person.city
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}