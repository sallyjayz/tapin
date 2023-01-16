package com.sallyjayz.tapin.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.sallyjayz.tapin.model.measurement.CustomerAndMeasurement
import com.sallyjayz.tapin.model.organization.OrganisationWithStaff

@Dao
interface OrganisationDao {
    @Transaction
    @Query("SELECT * FROM organisation")
    fun getOrganisationWithStaffs(): List<OrganisationWithStaff>
}