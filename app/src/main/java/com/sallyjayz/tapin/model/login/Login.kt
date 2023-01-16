package com.sallyjayz.tapin.model.login

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login")
data class Login(
    @PrimaryKey
    @ColumnInfo(name = "login_id")
    val loginId: Long,
    @ColumnInfo(name = "login_date")
    val loginDate: String,
    @ColumnInfo(name = "login_time")
    val loginTime: String,
    @ColumnInfo(name = "staff_id")
    val staffId: Long,
)
