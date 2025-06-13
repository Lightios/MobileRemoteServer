package pl.michal_cyran.mobileremoteserver.volume

import pl.michal_cyran.mobileremoteserver.core.CMDExecutor

class VolumeManager {
    private val cmdExecutor = CMDExecutor()

    fun setVolume(volume: Int) {
        if (volume < 0 || volume > 100) {
            throw IllegalArgumentException("Volume must be between 0 and 100")
        }
        cmdExecutor.executeCommand("nircmd.exe setsysvolume ${volume * 655.35}")
    }

    fun setMute(mute: Boolean) {
        cmdExecutor.executeCommand("nircmd.exe mutesysvolume ${if (mute) 1 else 0}")
    }

    fun getVolume(): Int {

        return 0;
    }
}
