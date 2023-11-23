package com.sample.methods

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component


@Component
class MethodFinder(
    private val context: ApplicationContext
) {

    fun find(clazz: Class<*>, methodName: String, parameterTypes: List<Class<*>>, args: List<Any>) {
        val bean = context.getBean(clazz)
        val method = clazz.getDeclaredMethod(methodName, *parameterTypes.toTypedArray())
        val result = method.invoke(bean, *args.toTypedArray())
        print(result)
    }
}