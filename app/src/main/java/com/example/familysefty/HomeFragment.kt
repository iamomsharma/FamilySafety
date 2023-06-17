package com.example.familysefty

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.familysefty.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)


        initialization()

        return binding.root
    }

    private fun initialization() {

        val memberArrayList = arrayListOf<MemberDataClass>(
            MemberDataClass("Om Prakash Sharma"),
            MemberDataClass("Om Prakash Sharma"),
            MemberDataClass("Om Prakash Sharma"),
            MemberDataClass("Om Prakash Sharma"),
            MemberDataClass("Om Prakash Sharma"),
            MemberDataClass("Om Prakash Sharma")
        )

        val memberAdapter = MemberListAdapter(memberArrayList)
        binding.rvMember.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMember.adapter = memberAdapter

        Log.d("TAG", "@@@ initialization: - First TIme")
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}