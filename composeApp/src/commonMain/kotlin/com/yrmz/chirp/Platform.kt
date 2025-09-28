package com.yrmz.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform