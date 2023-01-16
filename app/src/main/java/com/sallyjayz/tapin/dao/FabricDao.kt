package com.sallyjayz.tapin.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.sallyjayz.tapin.model.fabric.CustomerAndFabric
import com.sallyjayz.tapin.model.fabric.StaffAndFabric

@Dao
interface FabricDao {
    @Transaction
    @Query("SELECT * FROM fabrics")
    fun getCustomerAndFabrics(): List<CustomerAndFabric>

    @Transaction
    @Query("SELECT * FROM fabrics")
    fun getStaffAndFabrics(): List<StaffAndFabric>
}