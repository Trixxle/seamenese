plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.seamenese.immersion"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.seamenese.immersion"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
}
