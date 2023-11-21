//plugins {
//    id("stopwatch.lint")
//    id("stopwatch.android.library")
//    id("stopwatch.android.feature")
//    kotlin("kapt")
//    id("dagger.hilt.android.plugin")
//    alias(libs.plugins.org.jetbrains.kotlin.android)
//}
//android {
//    namespace = "com.timers.stopwatch.feature.pomodoro_initial.presentation"
//}
//
//dependencies {
//    implementation(projects.core.commonAndroid)
//    implementation(projects.core.database)
//    implementation(projects.core.model)
//    implementation(projects.feature.pomodoroInitial.domain)
//
//    implementation(libs.hilt.android)
//    implementation(libs.legacy.support.v4)
//    implementation(libs.androidx.lifecycle)
//    implementation(libs.lifecycle.viewmodel.ktx)
//    kapt(libs.hilt.compiler)
//}

plugins {
    id("stopwatch.lint")
    id("stopwatch.android.feature")
}

android {
    namespace = "com.timers.stopwatch.feature.pomodoro_initial.presentation"
}
dependencies {
}
