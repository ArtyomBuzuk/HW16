package com.artyombuzuk.hw16

import java.util.*

fun main() {
    Container.addSubscriber(Printer())
    Container.addElement(Worker("sadad", 1, "1", 0.0, Date()))
}