pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(
            url = "https://phonepe.mycloudrepo.io/public/repositories/phonepe-intentsdk-snapshots"
        )

    }
}

rootProject.name = "PhonepeSdk"
include(":app")
 