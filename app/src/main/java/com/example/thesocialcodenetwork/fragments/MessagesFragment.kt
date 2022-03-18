package com.example.thesocialcodenetwork.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.thesocialcodenetwork.R
import com.example.thesocialcodenetwork.adapters.TabLayoutViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_messages.*
import kotlinx.android.synthetic.main.fragment_news.*

class MessagesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_messages, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view_pager.adapter = TabLayoutViewPagerAdapter(this)
        TabLayoutMediator(tab_layout, view_pager) { tab: TabLayout.Tab, i: Int ->
            if (i == 0) {
                tab.text = getString(R.string.friends)
            } else {
                tab.text = getString(R.string.groups)
            }
        }.attach()

        roll_back_button.setOnClickListener() {

            view.findNavController().navigate(
                R.id.action_messagesFragment_to_newsFragment
            )
        }
    }

}