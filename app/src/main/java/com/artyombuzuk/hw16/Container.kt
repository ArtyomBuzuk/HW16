package com.artyombuzuk.hw16

object Container {
    private val listObservers = arrayListOf<Observable>()
    private val list = arrayListOf<Worker>()

    fun addElement(element: () -> Worker) {
        list.add(element)
        listObservers.forEach {
            it.doOnChanged()
        }
    }

    fun getAllElements() = list

    fun addSubscriber(subscriber: Observable) {
        listObservers.add(subscriber)

    }
}