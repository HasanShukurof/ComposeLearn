//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    alias(libs.plugins.android.application) apply false
//    alias(libs.plugins.kotlin.android) apply false
//    alias(libs.plugins.kotlin.compose) apply false
//}

val kotlinVersion = "2.1.10"

buildscript {
//    extra.apply {
//        set("kotlin_version", "2.1.10")
//        set("hilt_version", "2.55")
//    }
    repositories {
        google()
//        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath (libs.gradle)
        classpath (libs.kotlin.gradle.plugin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
        classpath (libs.google.services)
        classpath (libs.androidx.navigation.safe.args.gradle.plugin)
        classpath (libs.firebase.crashlytics.gradle)

    }
}

//plugins {
//    id ("org.jlleitschuh.gradle.ktlint" version "7.1.0")
//    id 'com.google.dagger.hilt.android' version '2.43.2' apply false
//    id 'org.jetbrains.kotlin.android' version '2.1.10' apply false
//}


