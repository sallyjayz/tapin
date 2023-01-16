package com.sallyjayz.tapin.model.login

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login_type")
data class LoginType(
    @PrimaryKey
    @ColumnInfo(name = "login_type_id")
    val loginTypeId: Long,
    @ColumnInfo(name = "login_type")
    val loginType: String
)
