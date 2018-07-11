package llh.mykotlinstudystudy

/**
 * Created by liulh on 2018/7/11.
 */
interface PlayerView {
    fun showView()
}

class MediaPlayerView(view:PlayerView) : PlayerView by view