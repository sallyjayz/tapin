package com.sallyjayz.tapin.model.login

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Staff

data class LoginTypeAndStaff(
    @Embedded val loginType: LoginType,
    @Relation(
        parentColumn = "loginTypeId",
        entityColumn = "loginTypeId"
    )
    val staff: Staff
)
