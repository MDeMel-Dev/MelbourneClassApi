package com.mca.api.melbourneclassapi.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = arrayOf("/login"))
class LoginController {

    @GetMapping(value = arrayOf("/user"))
    fun checkLogin(@RequestParam(required = true) username: String, @RequestParam(required = true) password: String ): ResponseEntity<String> {

        val authenticated = userBank.users.find {
            it.first.contains(username, ignoreCase = true)
        }?.second.equals(password) ?: false


        return if (authenticated) {
            ResponseEntity.ok("You are logged in")
        } else {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("wrong username or password")
        }
    }
}

object userBank {

    val users = listOf<Pair<String, String>>(
            Pair("Matt", "whevf"),
            Pair("Tin", "wuegfdiywe"),
            Pair("Carl", "bawusdgw"),
            Pair("Nabil", "dwehdawehfwa"),
            Pair("Pamitha", "wkebdfw")
    )
}