package com.sallyjayz.tapin.model.fabric

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Customer

data class CustomerAndFabric(
    @Embedded val customer: Customer,
    @Relation(
        parentColumn = "customerId",
        entityColumn = "fabricOfCustomerId",
    )
    val fabric: Fabric
)
