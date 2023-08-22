package com.papayacoders.phonepesdk.models

data class PaymentInitiatedModel(
    val code: String,
    val `data`: Data,
    val message: String,
    val success: Boolean
)