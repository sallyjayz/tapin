package com.sallyjayz.tapin.model.invoice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "invoice")
data class Invoice(
    @PrimaryKey
    @ColumnInfo(name = "invoice_id")
    val invoiceId: Long,
    @ColumnInfo(name = "invoice_number")
    val invoiceNumber: Int,
    @ColumnInfo(name = "total_amount")
    val totalAmount: Int,
    @ColumnInfo(name = "deposit_amount")
    val depositAmount: Int,
    @ColumnInfo(name = "balance_amount")
    val balanceAmount: Int,
    @ColumnInfo(name = "discount")
    val discount: Int,
    @ColumnInfo(name = "shipping_price")
    val shippingPrice: Int,
    @ColumnInfo(name = "tax")
    val tax: Long,
    @ColumnInfo(name = "billed_to")
    val customerId: Long,
    @ColumnInfo(name = "fabric")
    val fabricId: Long,
    @ColumnInfo(name = "organisation")
    val organisationId: Long,
    @ColumnInfo(name = "staff")
    val staffId: Long,
)
