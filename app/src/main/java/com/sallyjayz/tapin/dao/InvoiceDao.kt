package com.sallyjayz.tapin.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.sallyjayz.tapin.model.fabric.CustomerAndFabric
import com.sallyjayz.tapin.model.fabric.StaffAndFabric
import com.sallyjayz.tapin.model.invoice.CustomerAndInvoice
import com.sallyjayz.tapin.model.invoice.FabricAndInvoice
import com.sallyjayz.tapin.model.invoice.OrganisationAndInvoice
import com.sallyjayz.tapin.model.invoice.StaffAndInvoice

@Dao
interface InvoiceDao {
    @Transaction
    @Query("SELECT * FROM invoice")
    fun getCustomerAndInvoices(): List<CustomerAndInvoice>

    @Transaction
    @Query("SELECT * FROM invoice")
    fun getFabricAndInvoices(): List<FabricAndInvoice>

    @Transaction
    @Query("SELECT * FROM invoice")
    fun getOrganisationAndInvoices(): List<OrganisationAndInvoice>

    @Transaction
    @Query("SELECT * FROM invoice")
    fun getStaffAndInvoices(): List<StaffAndInvoice>
}