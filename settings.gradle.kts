pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Stopwatch"
include(":core:model")
include(":core:domain")
include(":core:data")
include(":core:common-android")
include(":core:preference")
include(":core:database")
include(":core:data-source:api")
include(":core:data-source:impl")
include(":core:log")
include(":app")
include(":feature")
include(":feature:pomodoro")
include(":feature:pomodoro-initial")
include(":feature:pomodoro-initial:presentation")
include(":feature:pomodoro-initial:domain")
include(":feature:pomodoro-initial:data-source")
include(":feature:pomodoro-initial:data-source:api")
include(":feature:pomodoro-initial:data-source:impl")
