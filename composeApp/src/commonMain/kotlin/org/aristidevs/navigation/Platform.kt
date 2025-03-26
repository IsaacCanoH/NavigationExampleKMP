package org.aristidevs.navigation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform