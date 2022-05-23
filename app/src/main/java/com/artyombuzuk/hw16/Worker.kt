package com.artyombuzuk.hw16

import java.util.*

data class Worker(
    val name: String,
    val id: Int,
    val position: String,
    val payment: Double?,
    var date: Date = Date()
)


