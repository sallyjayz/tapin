package com.sallyjayz.tapin.model.login

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Staff

data class StaffAndLogin(
    @Embedded val staff: Staff,
    @Relation(
        parentColumn = "staffId",
        entityColumn = "staffId"
    )
    val login: Login
)
