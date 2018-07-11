package llh.mykotlinstudystudy

/**
 * Created by liulh on 2018/7/11.
 */
sealed class PlayerViewType {
    object BLUE : PlayerViewType()
}

fun getViewPlayerView(type: PlayerViewType) = when (type) {
    PlayerViewType.BLUE -> BluePlayerView()
}