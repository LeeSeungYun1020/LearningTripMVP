package com.leeseungyun1020.learningtripmvp.ui.story

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leeseungyun1020.learningtripmvp.R
import com.leeseungyun1020.learningtripmvp.databinding.FragmentHomeBinding
import com.leeseungyun1020.learningtripmvp.databinding.FragmentStoryBinding
import com.leeseungyun1020.learningtripmvp.ui.home.HomeViewModel

class StoryFragment : Fragment() {
    private var _binding: FragmentStoryBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val storyViewModel =
            ViewModelProvider(this)[StoryViewModel::class.java]

        _binding = FragmentStoryBinding.inflate(inflater, container, false)

        return binding.root
    }
}