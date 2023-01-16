package com.sallyjayz.tapin.model.fabric

import androidx.room.Embedded
import androidx.room.Relation
import com.sallyjayz.tapin.model.contact.Customer
import com.sallyjayz.tapin.model.contact.Staff

data class StaffAndFabric(
    @Embedded val staff: Staff,
    @Relation(
        parentColumn = "staffId",
        entityColumn = "collectFromStaffId",
    )
    val fabric: Fabric
)
