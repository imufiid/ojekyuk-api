package com.mufid.ojekyukapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class SimpleController {

    @GetMapping("/ping")
    fun ping(): String {
        return "PING OK"
    }
}