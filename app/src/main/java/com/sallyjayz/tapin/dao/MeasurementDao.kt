package com.sallyjayz.tapin.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.sallyjayz.tapin.model.measurement.CustomerAndMeasurement

@Dao
interface MeasurementDao {
    @Transaction
    @Query("SELECT * FROM measurement")
    fun getCustomerAndMeasure(): List<CustomerAndMeasurement>
}