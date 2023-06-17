package com.example.familysefty

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.familysefty.databinding.AdapterItemMemberBinding

class MemberListAdapter(private val memberArrayList: ArrayList<MemberDataClass>) :
    RecyclerView.Adapter<MemberListAdapter.ViewHolder>() {

    private lateinit var binding: AdapterItemMemberBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding =
            AdapterItemMemberBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = memberArrayList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val memberList = memberArrayList[position]
        holder.bind(memberList)
    }

    class ViewHolder(private val item: AdapterItemMemberBinding) :
        RecyclerView.ViewHolder(item.root) {

        fun bind(memberList: MemberDataClass) {
            item.tvName.text = memberList.name
        }


    }
}