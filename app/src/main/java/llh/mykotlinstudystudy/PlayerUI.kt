package llh.mykotlinstudystudy

import llh.mykotlinstudystudy.PlayerUI.Holder.instance

/**
 * Created by liulh on 2018/7/11.
 */
class PlayerUI private constructor() {
    companion object {
        fun get(): PlayerUI {
            return instance;
        }
    }

    private object Holder {
        val instance = PlayerUI()
    }



}