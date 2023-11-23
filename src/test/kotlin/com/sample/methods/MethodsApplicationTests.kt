package com.sample.methods

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MethodsApplicationTests {

    @Autowired
    private lateinit var methodFinder: MethodFinder

    @Test
    fun contextLoads() {
        methodFinder.find(Sample::class.java, "sample", listOf(Int::class.java, Int::class.java), listOf(1, 2))
    }

}
