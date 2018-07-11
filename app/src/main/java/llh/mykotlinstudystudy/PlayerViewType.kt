package llh.mykotlinstudystudy

/**
 * Created by liulh on 2018/7/11.
 */
sealed class PlayerViewType {
    object BLUE : PlayerViewType()
    object BLACK : PlayerViewType()
    class VIP(val title: String? = null, val message: String? = null) : PlayerViewType()
}

fun getViewPlayerView(type: PlayerViewType) = when (type) {
    PlayerViewType.BLUE -> BluePlayerView()
    PlayerViewType.BLACK -> BlackPlayerView()
    is PlayerViewType.VIP -> VIPPlayer(type.title, type.message)
}