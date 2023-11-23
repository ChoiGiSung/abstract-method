package com.sample.methods

import org.springframework.stereotype.Component

@Component
class Sample {

    fun sample(a: Int, b: Int): Int {
        return a + b
    }

    fun sample(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }


}