package pl.michal_cyran.mobileremoteserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MobileRemoteServerApplication

fun main(args: Array<String>) {
    runApplication<MobileRemoteServerApplication>(*args)
}
