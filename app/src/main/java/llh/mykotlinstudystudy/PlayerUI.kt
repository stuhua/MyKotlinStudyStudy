package llh.mykotlinstudystudy

/**
 * Created by liulh on 2018/7/11.
 */
class PlayerUI private constructor() {
    companion object {
        fun get(): PlayerUI {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = PlayerUI()
    }

    fun showPlayer(user: User) {
        MediaPlayerView(getViewPlayerView(user.type)).showView()
    }

}