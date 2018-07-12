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
}
