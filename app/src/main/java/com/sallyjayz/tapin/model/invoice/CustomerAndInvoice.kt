package com.sallyjayz.tapin.model.invoice

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Customer

data class CustomerAndInvoice(
    @Embedded val customer: Customer,
    @Relation(
        parentColumn = "customerId",
        entityColumn = "customerId"
    )
    val invoice: Invoice
)
