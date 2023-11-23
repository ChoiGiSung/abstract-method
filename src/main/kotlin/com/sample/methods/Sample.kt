package src.main.kotlin.com.sample.methods

import java.lang.reflect.Method
class Sample {
    fun sample(a: Long?, b: String, c: Double?) {
        print("$a$b$c")
    }
}

class MethodFinder {
    fun find(clazz: Class<*>, methodName: String, parameterTypes: Array<Class<*>>): Method {
        return clazz.getMethod(methodName, *parameterTypes)
    }
}

fun main() {
    val methodFinder = MethodFinder()
    val method = methodFinder.find(
        Sample::class.java,
        "sample",
        arrayOf(java.lang.Long::class.java, String::class.java, java.lang.Double::class.java)
    )

    val sampleInstance = Sample()

    // 메서드를 호출하고 결과를 출력
    method.invoke(sampleInstance, 10L, "Hello, ", 3.14)
}