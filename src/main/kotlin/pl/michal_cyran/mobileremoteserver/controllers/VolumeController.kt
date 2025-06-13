package pl.michal_cyran.mobileremoteserver.controllers

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import pl.michal_cyran.mobileremoteserver.volume.VolumeManager

@RestController
@RequestMapping("/volume")
class VolumeController {
    private val logger = LoggerFactory.getLogger(VolumeController::class.java)
    private val volumeManager = VolumeManager()


    @PostMapping
    fun handlePost(
        @RequestBody body: Volume
    ): Volume {
        logger.info("Received POST request with body: $body")
        volumeManager.setVolume(body.value)
        volumeManager.setMute(body.isMuted)
        
        return body
    }
}