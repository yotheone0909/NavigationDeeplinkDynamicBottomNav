package com.example.navigationdeeplink

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class SecondViewModel: ViewModel() {

    val onGetTypeSecond = MutableLiveData<Boolean>()

    fun getType() {
        onGetTypeSecond.value = Random.nextBoolean()
    }
}