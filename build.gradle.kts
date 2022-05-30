// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version Versions.Core.androidApplication apply false
    id("com.android.library") version Versions.Core.androidApplication apply false
    id("org.jetbrains.kotlin.android") version Versions.Core.kotlinAndroid apply false
}

tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}