package com.sallyjayz.tapin.model.invoice

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Customer
import com.sallyjayz.tapin.model.fabric.Fabric

data class FabricAndInvoice(
    @Embedded val fabric: Fabric,
    @Relation(
        parentColumn = "fabricId",
        entityColumn = "fabricId"
    )
    val invoice: Invoice
)
