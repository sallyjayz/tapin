package com.sallyjayz.tapin.model.measurement

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Customer

data class CustomerAndMeasurement(
    @Embedded val customer: Customer,
    @Relation(
        parentColumn = "customerId",
        entityColumn = "customerId"
    )
    val measurement: Measurement
)
