package com.papayacoders.phonepesdk

import com.papayacoders.phonepesdk.models.Data

data class ApiResponse(
    val code: String,
    val `data`: Data,
    val message: String,
    val success: Boolean
)