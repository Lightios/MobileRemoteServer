import pl.michal_cyran.mobileremoteserver.core.CMDExecutor

class KeyboardManager {
    private val cmdExecutor = CMDExecutor()

    fun pauseVideo() {
        pressKey("spc")
    }

    fun pressKey(key: String) {
        cmdExecutor.executeCommand("nircmd.exe sendkeypress $key")
    }
}