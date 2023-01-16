package com.sallyjayz.tapin.model.measurement

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "measurement")
data class Measurement(
    @PrimaryKey
    @ColumnInfo(name = "measurement_id")
    val measurementId: Long,
    val bust: String?,
    @ColumnInfo(name = "under_bust")
    val underBust: String?,
    @ColumnInfo(name = "bust_radius")
    val bustRadius: String?,
    @ColumnInfo(name = "bust_span")
    val bustSpan: String?,
    @ColumnInfo(name = "shoulder_front")
    val shoulderFront: String?,
    @ColumnInfo(name = "shoulder_back")
    val shoulderBack: String?,
    @ColumnInfo(name = "across_chest")
    val acrossChest: String?,
    @ColumnInfo(name = "across_back")
    val acrossBack: String?,
    @ColumnInfo(name = "full_front_length")
    val fullFrontLength: String?,
    @ColumnInfo(name = "nape_to_waist")
    val napeToWaist: String?,
    val hips: String?,
    val waist: String?,
    @ColumnInfo(name = "side_waist_to_knee")
    val shoulderWaistToKnee: String?,
    @ColumnInfo(name = "side_waist_to_ankle")
    val shoulderWaistToAnkle: String?,
    @ColumnInfo(name = "side_waist_to_floor")
    val shoulderWaistToFloor: String?,
    @ColumnInfo(name = "sleeve_length")
    val sleeveLength: String?,
    val bicep: String?,
    val wrist: String?,
    val crotch: String?,
    @ColumnInfo(name = "dress_length")
    val dressLength: String?,
    @ColumnInfo(name = "skirt_length")
    val skirtLength: String?,
    @ColumnInfo(name = "trouser_length")
    val trouserLength: String?,
    @ColumnInfo(name = "customer_id")
    val customerId: Long
)
