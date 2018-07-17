package llh.mykotlinstudystudy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    //    public fun File.readText(charset: Charset =Charsets.UTF_8):String=readBytes().toString(charset)
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun Test1() {

        onlyif(true) {
            println("llh")
        }

        val runnable = Runnable {
            println("Runnable::run")
        }
        val function: () -> Unit
        function = runnable::run
    }

    fun onlyif(isDebug: Boolean, block: () -> Unit) {
        if (isDebug) block()
    }
    /*   var runnable = Runnable {  }
       val function:()->Unit
       function=runnable::run*/

    @Test
    fun test2() {
        decor(::hello)
        decor { println("hello1") }
    }

    fun shop(girl: String, play: () -> Unit) {
        println("girl:$girl")
        play
    }

    fun decor(func: () -> Unit): Unit {
        fun funcPlus() {
            println("start")
            func()
            println("end")
        }
        return funcPlus()
    }

    fun hello() {
        println("hello111")
    }

    @Test
    fun Test3() {
        var ints = arrayListOf<Int>(1, 2, 3)
        var newInts = ints.IntsMap { it * 10 }
        newInts.forEach { println(it) }
    }

    fun List<Int>.IntsMap(transform: (Int) -> Int): List<Int> {
        var result = arrayListOf<Int>()
        for (item in this) {
            result.add(transform(item))
        }
        return result
    }

    @Test
    fun Test4() {
        val firstName: String = "tao"
        val lastName: String? = null

        println("my name is ${getName(firstName, lastName)}")
    }

    fun hasEmpty(vararg strArray: String?): Boolean {
        for (str in strArray) {
            str ?: return true
        }
        return false
    }

    fun getName(firstName: String?, lastName: String? = "unknow"): String {
        if (hasEmpty(firstName, lastName)) {
            lastName?.let { return@getName "${checkName(firstName)} $lastName" }
            firstName?.let { return@getName "$firstName ${checkName(lastName)}" }
        }
        return "$firstName $lastName"
    }

    fun checkName(name: String?): String = name ?: "unknow"
    @Test
    fun Test5() {
//        function()
        { msg: String ->
            println(msg)
        }("liulianhua")
    }

    fun function() {
        val str = "hello!"

        fun say(count: Int = 10) {
            println(str + count)
            if (count > 0) {
                say(count - 1)
            }
        }
        say()
    }

    @Test
    fun Test6() {
        {
            val list: List<String> = listOf("hello", "world")
            list.convert {
                it.hashCode()
            }.forEach {
                        print("$it")
                    }
        }()
    }

    inline fun <T, E> Iterable<T>.convert(action: (T) -> E): MutableList<E> {
        val list: MutableList<E> = mutableListOf()
        for (element in this) list.add(action(element))
        return list
    }


}
