plugins {
    alias(androidx.plugins.library)
}

android {
    namespace = "eu.davidea.flexibleadapter"
    compileSdk = 30

    defaultConfig {
        minSdk = 14
        buildConfigField("String", "VERSION_NAME", "\"5.1.0\"")
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.recyclerview:recyclerview:1.1.0")
}
