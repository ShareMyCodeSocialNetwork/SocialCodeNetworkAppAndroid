package com.example.thesocialcodenetwork.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thesocialcodenetwork.holders.ViewHolderAdapter

class RecyclerAdapter : RecyclerView.Adapter<ViewHolderAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAdapter {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolderAdapter, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    companion object {
        private const val TYPE_USER = 0
        private const val TYPE_GROUP = 1
        private const val TYPE_FRIEND = 2
        private const val TYPE_FOLLOWER = 3
//TODO COMPLETE THIS LIST
    }
}