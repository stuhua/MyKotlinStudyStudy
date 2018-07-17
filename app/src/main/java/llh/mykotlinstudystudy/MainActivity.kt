package llh.mykotlinstudystudy

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User(1, "llh", PlayerViewType.BLACK)
        PlayerUI.get().showPlayer(user)
        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            toast(this,"我是按钮1")
        }
        val job = async(CommonPool) {
            delay(10 * 1000)
            "Liulianhua"
        }

        launch(UI) {
            //await()的规则是：如果此刻job2已经执行完则立刻返回结果，否则等待job2执行
            Log.d("MainActivity", "begin")
            println(job.await())
            Log.d("MainActivity", "after")
        }

    }
}
fun Activity.toast(context: Context, text: String, duration: Int = Toast.LENGTH_SHORT): Unit {
    Toast.makeText(context, text, duration).show()
}

