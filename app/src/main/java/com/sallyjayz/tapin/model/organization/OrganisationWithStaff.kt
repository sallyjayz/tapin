package com.sallyjayz.tapin.model.organization

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Staff

data class OrganisationWithStaff(
    @Embedded val organisation: Organisation,
    @Relation(
        parentColumn = "organisationId",
        entityColumn = "organisationId"
    )
    val staff: List<Staff>
)
