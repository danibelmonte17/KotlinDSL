plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {

    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.kotlindsl"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "0.0.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {

    implementation(fileTree("libs"){ include(listOf("*.jar")) })

    implementation("androidx.core:core-ktx:${Versions.Core.coreKtx}")
    implementation("androidx.appcompat:appcompat:${Versions.Core.appCompat}")
    implementation("com.google.android.material:material:${Versions.Core.material}")
    implementation("androidx.constraintlayout:constraintlayout:${Versions.Core.constraintLayout}")
    testImplementation("junit:junit:${Versions.Core.testJUnit}")
    androidTestImplementation("androidx.test.ext:junit:${Versions.Core.androidTestJUnit}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${Versions.Core.espressoCore}")
}