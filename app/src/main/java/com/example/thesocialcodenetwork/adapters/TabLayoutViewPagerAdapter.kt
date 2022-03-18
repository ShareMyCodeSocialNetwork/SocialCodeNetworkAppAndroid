package com.example.thesocialcodenetwork.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.thesocialcodenetwork.fragments.messagesFragmentChilds.FriendsMessagesFragment
import com.example.thesocialcodenetwork.fragments.messagesFragmentChilds.GroupsMessagesFragment

class TabLayoutViewPagerAdapter(fragmentActivity: Fragment) : FragmentStateAdapter(fragmentActivity)  {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FriendsMessagesFragment()
            }
            else -> {
                GroupsMessagesFragment()
            }
        }
    }
}