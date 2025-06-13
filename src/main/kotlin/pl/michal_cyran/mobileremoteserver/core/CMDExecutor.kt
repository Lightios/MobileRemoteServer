package pl.michal_cyran.mobileremoteserver.core

import java.io.IOException
import java.io.InputStream
import java.text.SimpleDateFormat
import java.util.*

class CMDExecutor {
    fun executeCommand(command: String) {
        try {
            log(command)
            val process = Runtime.getRuntime().exec(command)
            logOutput(process.inputStream, "")
            logOutput(process.errorStream, "Error: ")
            process.waitFor()
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

    private fun logOutput(inputStream: InputStream, prefix: String) {
        Thread {
            val scanner: Scanner = Scanner(inputStream, "UTF-8")
            while (scanner.hasNextLine()) {
                synchronized(this) {
                    log(prefix + scanner.nextLine())
                }
            }
            scanner.close()
        }.start()
    }

    private
    var format: SimpleDateFormat = SimpleDateFormat("MM/dd/yyyy hh:mm:ss:SSS")

    @Synchronized
    private fun log(message: String) {
        println(format.format(Date()) + ": " + message)
    }
}