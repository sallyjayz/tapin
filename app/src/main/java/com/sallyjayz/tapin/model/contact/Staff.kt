package com.sallyjayz.tapin.model.contact

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "staffs")
data class Staff(
    @PrimaryKey
    @ColumnInfo(name = "staff_id")
    val staffId: Long,
    @ColumnInfo(name = "staff_contact_id")
    val staffContactId: Long,
    @ColumnInfo(name = "organisation_id")
    val organisationId: Long,
    @ColumnInfo(name = "login_type_id")
    val loginTypeId: Long
)
