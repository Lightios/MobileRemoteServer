package pl.michal_cyran.mobileremoteserver.controllers

import KeyboardManager
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tab-click")
class TabController {
    private val logger = LoggerFactory.getLogger(VolumeController::class.java)
    private val keyboardManager = KeyboardManager()


    @PostMapping
    fun handlePost(
        @RequestBody body: String
    ) {
        logger.info("Received POST request to click tab")

        keyboardManager.pressKey("tab")
    }
}