plugins {
    id("stopwatch.lint")
    id("stopwatch.android.library")
    id("stopwatch.android.feature")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}
android {
    namespace = "com.timers.stopwatch.feature.pomodoro_initial.data_source.impl"
}

dependencies {
    implementation(projects.core.commonAndroid)
    implementation(projects.feature.pomodoroInitial.dataSource.api)
    implementation(projects.core.database)
    implementation(projects.core.preference)
    implementation(projects.core.model)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}
