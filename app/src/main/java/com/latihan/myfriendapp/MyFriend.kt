package com.latihan.myfriendapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyFriend(
    @PrimaryKey(autoGenerate = true)
    val temanId: String? = null,
    val nama: String,
    val kelamin: String,
    val email: String,
    val telp: String,
    val alamat: String
)