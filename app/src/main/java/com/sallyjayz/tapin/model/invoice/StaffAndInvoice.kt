package com.sallyjayz.tapin.model.invoice

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Customer
import com.sallyjayz.tapin.model.contact.Staff
import com.sallyjayz.tapin.model.fabric.Fabric
import com.sallyjayz.tapin.model.organization.Organisation

data class StaffAndInvoice(
    @Embedded val staff: Staff,
    @Relation(
        parentColumn = "staffId",
        entityColumn = "staffId"
    )
    val invoice: Invoice
)
