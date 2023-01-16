package com.sallyjayz.tapin.model.organization

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "organisation")
data class Organisation(
    @PrimaryKey
    @ColumnInfo(name = "organisation_id")
    val organisationId: Long,
    @ColumnInfo(name = "organisation_name")
    val organisationName: String
)
