package com.sallyjayz.tapin.model.contact

import androidx.room.Embedded
import androidx.room.Relation

data class ContactAndCustomer(
    @Embedded val ContactInformation: ContactInformation,
    @Relation(
        parentColumn = "contactId",
        entityColumn = "customerContactId"
    )
    val customer: Customer
)
