package com.artyombuzuk.hw16

import java.time.LocalDate
import java.util.*

class Printer : Observable {
    override fun doOnChanged() {
        Container.getAllElements().forEach {
            println(it.toString())
        }
    }
}