package com.sallyjayz.tapin.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.sallyjayz.tapin.model.login.LoginTypeAndStaff
import com.sallyjayz.tapin.model.login.StaffAndLogin
import com.sallyjayz.tapin.model.measurement.CustomerAndMeasurement

@Dao
interface LoginDao {
    @Transaction
    @Query("SELECT * FROM login")
    fun getStaffAndLogins(): List<StaffAndLogin>

    @Transaction
    @Query("SELECT * FROM login_type")
    fun getLoginTypeAndStaffs(): List<LoginTypeAndStaff>
}