package com.latihan.myfriendapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.my_friends_fragment.*

class MyFriendsFragment : Fragment() {
    companion object {
        fun newInstance(): MyFriendsFragment {
            return MyFriendsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container:
        ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.my_friends_fragment,
            container, false
        )
    }

    override fun onViewCreated(
        view: View, savedInstanceState:
        Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        fabAddFriend.setOnClickListener {
            (activity as
                    MainActivity).tampilMyFriendsAddFragment()
        }
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }

    lateinit var listTeman: MutableList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(
            MyFriend(
                "Muhammad", "Laki-laki",
                "ade@gmail.com", "085719004268", "Bandung", "Sawojajar2"
            )
        )
        listTeman.add(
            MyFriend(
                "Al Harits", "Laki-laki",
                "rifaldi@gmail.com", "081213416171", "Bandung", "Sawojajar2"
            )
        )
    }

    private fun tampilTeman() {
        listMyFriends.layoutManager = LinearLayoutManager(activity)
        listMyFriends.adapter = MyFriendAdapter(activity!!, listTeman as ArrayList<MyFriend>)
    }


}
