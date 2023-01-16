package com.sallyjayz.tapin.model.contact

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact_information")
data class ContactInformation(
    @PrimaryKey
    @ColumnInfo(name = "contact_id")
    val contactId: Long,
    @ColumnInfo(name = "first_name")
    val firstName: String,
    @ColumnInfo(name = "last_name")
    val lastName: String,
    @ColumnInfo(name = "middle_name")
    val middleName: String?,
    @ColumnInfo(name = "email_address")
    val emailAddress: String,
    @ColumnInfo(name = "phone_no")
    val phoneNumber: String,
    @ColumnInfo(name = "birth_date")
    val dateOfBirth: String
)
