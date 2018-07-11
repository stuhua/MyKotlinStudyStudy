package llh.mykotlinstudystudy

/**
 * Created by liulh on 2018/7/11.
 */
val TITLE = "播放器标题"
val MESSAGE = "播放器消息"

class VIPPlayer(var title: String?, var msg: String?) : PlayerView {

    init {
        println("主构造方法")
        title = title ?: TITLE
        msg = msg ?: MESSAGE
    }

    override fun showView() {
        println("我是高级vip")
    }

}