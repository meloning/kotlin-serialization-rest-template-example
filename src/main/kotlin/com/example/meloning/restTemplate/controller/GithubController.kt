package com.example.meloning.restTemplate.controller

import com.example.meloning.restTemplate.service.GithubService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class GithubController(
    private val githubService: GithubService
) {

    @GetMapping("/v1/users/{github-id}/rest-template")
    fun getUser(@PathVariable("github-id") githubId: String): ResponseEntity<Unit> {
        githubService.getUserRestTemplate(githubId)
        return ResponseEntity.noContent().build()
    }

    @GetMapping("/v1/users/{github-id}/web-client")
    fun getUserWebClient(@PathVariable("github-id") githubId: String): ResponseEntity<Unit> {
        githubService.getUserWebClient(githubId)
        return ResponseEntity.noContent().build()
    }
}
