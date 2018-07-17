package llh.mykotlinstudystudy

import android.app.Activity
import android.os.Bundle

/**
 * Created by liulh on 2018/7/17.
 */
class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toast(this, "haha")
    }
}