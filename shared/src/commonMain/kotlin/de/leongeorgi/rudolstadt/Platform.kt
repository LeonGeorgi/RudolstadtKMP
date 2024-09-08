package de.leongeorgi.rudolstadt

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform