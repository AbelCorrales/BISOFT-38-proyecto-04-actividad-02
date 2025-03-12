package org.example.actividad02

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform