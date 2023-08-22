package com.papayacoders.phonepesdk.models.status

data class CheckStatusModel(
    val code: String,
    val `data`: Data,
    val message: String,
    val success: Boolean
)