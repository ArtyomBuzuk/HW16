package com.artyombuzuk.hw16

class Printer : Observable {
    override fun doOnChanged() {
        Container.getAllElements().forEach {
            println(it.toString())
        }
    }

}