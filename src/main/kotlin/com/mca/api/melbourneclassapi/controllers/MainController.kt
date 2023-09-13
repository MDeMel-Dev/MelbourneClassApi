package com.mca.api.melbourneclassapi.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = arrayOf("/api"))
class MainController {

    @RequestMapping(value = arrayOf("/hello"), method = arrayOf(RequestMethod.GET))
    fun sayHello() = "  Hello Class, how are you going"
}