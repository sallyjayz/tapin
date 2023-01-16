package com.sallyjayz.tapin.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.sallyjayz.tapin.model.contact.ContactAndCustomer
import com.sallyjayz.tapin.model.contact.ContactAndStaff

@Dao
interface ContactInformationDao {
    @Transaction
    @Query("SELECT * FROM contact_information")
    fun getContactAndCustomers(): List<ContactAndCustomer>

    @Transaction
    @Query("SELECT * FROM contact_information")
    fun getContactAndStaff(): List<ContactAndStaff>
}