package llh.mykotlinstudystudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User(1, "llh", PlayerViewType.BLACK)
        PlayerUI.get().showPlayer(user)
       var tv: TextView

        tv.setOnClickListener{ println(it) }

    }
}

