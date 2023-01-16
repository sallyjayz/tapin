package com.sallyjayz.tapin.model.contact

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customers")
data class Customer(
    @PrimaryKey
    @ColumnInfo(name = "customer_id")
    val customerId: Long,
    @ColumnInfo(name = "customer_contact_id")
    val customerContactId: Long
)
