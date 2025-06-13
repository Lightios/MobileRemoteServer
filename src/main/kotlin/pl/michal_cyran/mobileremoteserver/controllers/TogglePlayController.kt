package pl.michal_cyran.mobileremoteserver.controllers

import KeyboardManager
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/toggle-play")
class TogglePlayController {
    private val logger = LoggerFactory.getLogger(VolumeController::class.java)
    private val keyboardManager = KeyboardManager()


    @PostMapping
    fun handlePost() {
        logger.info("Received POST request to toggle play/pause")

        keyboardManager.pauseVideo()
    }
}