android {
    namespace = "com.love.helloapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.love.helloapp"
        targetSdk = 34
        minSdk = 21
        versionCode = 1
        versionName = "1.0"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }
}

kotlin {
    jvmToolchain(17)
}
