package com.sallyjayz.tapin.model.fabric

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fabrics")
data class Fabric(
    @PrimaryKey
    @ColumnInfo(name = "fabric_id")
    val fabricId: Long,
    @ColumnInfo(name = "type")
    val fabricType: String,
    @ColumnInfo(name = "picture")
    val fabricPicture: String,
    @ColumnInfo(name = "yard_number")
    val numberOfYard: Int,
    @ColumnInfo(name = "date_received")
    val dateReceived: String,
    @ColumnInfo(name = "date_to_deliver")
    val dateDelivered: String,
    @ColumnInfo(name = "collected_by")
    val collectedBy: String,
    @ColumnInfo(name = "collected_from_staff")
    val collectFromStaffId: Long,
    @ColumnInfo(name = "customer_id")
    val fabricOfCustomerId: Long
)
