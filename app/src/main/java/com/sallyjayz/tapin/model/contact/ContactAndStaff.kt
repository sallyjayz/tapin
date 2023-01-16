package com.sallyjayz.tapin.model.contact

import androidx.room.Embedded
import androidx.room.Relation

data class ContactAndStaff(
    @Embedded val ContactInformation: ContactInformation,
    @Relation(
        parentColumn = "contactId",
        entityColumn = "staffContactId"
    )
    val staff: Staff
)
