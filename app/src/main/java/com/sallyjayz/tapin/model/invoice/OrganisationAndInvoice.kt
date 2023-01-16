package com.sallyjayz.tapin.model.invoice

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Customer
import com.sallyjayz.tapin.model.fabric.Fabric
import com.sallyjayz.tapin.model.organization.Organisation

data class OrganisationAndInvoice(
    @Embedded val organisation: Organisation,
    @Relation(
        parentColumn = "organisationId",
        entityColumn = "organisationId"
    )
    val invoice: Invoice
)
