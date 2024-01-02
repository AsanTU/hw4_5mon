package com.example.hw4_5mon

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val resCounter = MutableLiveData<Int>()

    val counter: LiveData<Int> get() = resCounter

    init {
        resCounter.value = 0
    }

    fun increment() {
        resCounter.value = (resCounter.value ?: 0) + 1
    }

    fun decrement() {
        val currentValue = resCounter.value ?: 0
        if (currentValue > 0) {
            resCounter.value = currentValue - 1
        }
    }
}